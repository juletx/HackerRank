if __name__ == '__main__':
    N = int(input())
    a = []
    
    for _ in range(N):
        command = input().split()
        if command[0] == "insert":
            a.insert(int(command[1]), int(command[2]))
        elif command[0] == "print":
            print(a)
        elif command[0] == "remove":
            a.remove(int(command[1]))
        elif command[0] == "append":
            a.append(int(command[1]))
        elif command[0] == "sort":
            a.sort()
        elif command[0] == "pop":
            a.pop()
        elif command[0] == "reverse":
            a.reverse()
            
