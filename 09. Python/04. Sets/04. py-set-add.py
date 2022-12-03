# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
s = set()

for _ in range(n):
    country = input()
    s.add(country)
    
print(len(s))
