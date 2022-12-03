# Enter your code here. Read input from STDIN. Print output to STDOUT
t = int(input())

for _ in range(t): 
    n = int(input())
    a = set(map(int, input().split()))
    m = int(input())
    b = set(map(int, input().split()))
    print(a.issubset(b))