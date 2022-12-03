# Enter your code here. Read input from STDIN. Print output to STDOUT
k = int(input())
rooms = list(map(int, input().split()))
suspects = set(rooms)

seen = set()
count = 0

while len(suspects) > 1:
    if rooms[count] in seen:
        suspects.discard(rooms[count])
    seen.add(rooms[count])
    count += 1
    
print(suspects.pop())