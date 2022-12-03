import string

def print_rangoli(size):
    # your code goes here
    alphabet = list(string.ascii_lowercase)
    count = size - 1 
    letters = []
    width = 4 * size - 3

    for i in range(size):
        letters.append(alphabet[count])
        reverse = list(reversed(letters[:-1]))
        print("-".join(letters + reverse).center(width, '-'))
        count = count - 1
        
    for i in range(size - 1): 
        letters.pop()
        reverse = list(reversed(letters[:-1]))
        print("-".join(letters + reverse).center(width, '-'))

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)