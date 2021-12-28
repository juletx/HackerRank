# Enter your code here. Read input from STDIN. Print output to STDOUT
from math import factorial
inp = input().split()
p = int(inp[0]) / 100
n = int(inp[1])

def comb(n, x):
    return factorial(n) / (factorial(x) * factorial(n-x))

def b(x, n, p):
    return comb(n, x) * p**x * (1-p)**(n-x)

b1 = 0
for x in range(0, 3):
    b1 += b(x, n, p)
    
b2 = 0
for x in range(2, 11):
    b2 += b(x, n, p)
    
print(round(b1, 3))
print(round(b2, 3))

