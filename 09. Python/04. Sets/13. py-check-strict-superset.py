# Enter your code here. Read input from STDIN. Print output to STDOUT
a = set(map(int, input().split()))
n = int(input())

is_superset = True

for _ in range(n):
    b = set(map(int, input().split()))
    is_superset &= a.issuperset(b) and a != b
    
print(is_superset)