import os
import requests
import logging
from bs4 import BeautifulSoup
from credentials import CSRF_TOKEN, COOKIE, USER_AGENT

logging.basicConfig(filename='readme.log',
                    format='%(asctime)s %(message)s', filemode='w')
logger = logging.getLogger()
logger.setLevel(logging.DEBUG)


def get_folder_names(path):
    folders = []
    for item in os.listdir(path):
        if not os.path.isfile(item) and item not in ('.git', '__pycache__'):
            folders.append(item)
    return folders


def get_file_names(path):
    files = os.listdir(path)
    return files


def get_request_headers():
    headers = {
        'x-csrf-token': CSRF_TOKEN,
        'cookie': COOKIE,
        'user-agent': USER_AGENT
    }
    return headers


def get_problem_data(file):
    number, fname, ext = file.split('.')
    fname = fname.strip()
    url = "https://hackerrank.com/challenges/" + fname + "/problem"
    html = requests.get(url, headers=get_request_headers())
    soup = BeautifulSoup(html.text, "html.parser")
    h1 = soup.select('h1.ui-icon-label')
    if h1 != []:
        name = h1[0].text.strip()
        p = soup.select('p.pull-right')
        if p != []:
            difficulty = p[0].text.strip()
            if difficulty == "[deleted]":
                difficulty = p[1].text.strip()
                score = p[2].text.strip()
            else:
                score = p[1].text.strip()
            if score == "15.00":
                score = "30"
        else:
            difficulty = "Easy"
            if name == "s10-mcq-7":
                score = "30"
            else:
                score = "10"
    else:
        if fname == 'js10-create-a-button':
            name = 'Day 8: Create a Button'
            difficulty = 'Easy'
            score = '20'
        if fname == 'js10-buttons-container':
            name = 'Day 8: Buttons Container'
            difficulty = 'Easy'
            score = '25'
        if fname == 'js10-binary-calculator':
            name = 'Day 9: Binary Calculator'
            difficulty = 'Medium'
            score = '30'
    return number, name, url, ext, difficulty, score


if __name__ == "__main__":
    readmeFile = open('README.md', 'w', encoding='utf-8')
    print('# HackerRank Challenge Solutions', file=readmeFile)

    folders = get_folder_names(os.getcwd())
    for folder in sorted(folders):
        print('\n# ' + folder, file=readmeFile)
        subfolders = get_folder_names(os.path.join(os.getcwd(), folder))
        for subfolder in sorted(subfolders):
            print('\n## ' + subfolder + "\n", file=readmeFile)
            print("| Number | Challenge | Solution | Difficulty | Score |",
                  file=readmeFile)
            print("| :-: | :-: | :-: | :-: | :-: |", file=readmeFile)
            files = get_file_names(os.path.join(
                os.getcwd(), folder, subfolder))
            for file in sorted(files):
                number, name, url, ext, difficulty, score = get_problem_data(
                    file)
                print('| ' + number + ' | [' + name + '](' + url + ')'
                        + ' | [' + ext + ']('
                        + folder.replace(' ', '%20') + '/' 
                        + subfolder.replace(' ', '%20') + '/'
                        + file.replace(' ', '%20') + ')'
                        + ' | ' + difficulty
                        + ' | ' + score + ' |', file=readmeFile)

    readmeFile.close()
