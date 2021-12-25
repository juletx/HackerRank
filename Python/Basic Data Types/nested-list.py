if __name__ == '__main__':
    scores = set()
    students = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append([name, score])
        scores.add(score)
    
    second = sorted(scores)[1]
    names = []
    for name, score in students:
        if score == second:
            names.append(name)
            
    names = sorted(names)
    
    for name in names:
        print(name)
    
