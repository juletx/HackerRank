# Enter your code here. Read input from STDIN. Print output to STDOUT
l = int(input())
a = set(map(int, input().split()))
n = int(input())

for _ in range(n):
    op = input().split()[0]
    b = set(map(int, input().split()))
    if op == "update":
        a.update(b)
    if op == "intersection_update":
        a.intersection_update(b)
    if op == "difference_update":
        a.difference_update(b)
    if op == "symmetric_difference_update":
        a.symmetric_difference_update(b)
    
print(sum(a))