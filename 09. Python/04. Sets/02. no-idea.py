# Enter your code here. Read input from STDIN. Print output to STDOUT
n, m = map(int, input().split())
array = list(map(int, input().split()))
a = set(list(map(int, input().split())))
b = set(list(map(int, input().split())))

happiness = 0
for i in array:
    if i in a:
        happiness += 1
        continue
    if i in b:
        happiness -= 1
        
print(happiness)