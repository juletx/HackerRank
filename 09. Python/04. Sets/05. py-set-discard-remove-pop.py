n = int(input())
s = set(map(int, input().split()))
count = int(input())

for i in range(count):
    command = input().split()
    if command[0] == "pop":
        s.pop()
    elif command[0] == "remove":
        s.remove(int(command[1]))
    else:
        s.discard(int(command[1]))
        
print(sum(s))
