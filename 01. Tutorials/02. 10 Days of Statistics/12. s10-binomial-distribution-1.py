import math
# Enter your code here. Read input from STDIN. Print output to STDOUT
inp = input().split()
boys = float(inp[0])
girls = float(inp[1])
p = boys / (boys + girls)
q = 1 - p
n = 6

b = 0
for x in range(3, 7):
    comb = math.factorial(n) / (math.factorial(x) * math.factorial(n-x))
    b += comb * (p**x) * (q**(n-x))
    
print(round(b, 3))
