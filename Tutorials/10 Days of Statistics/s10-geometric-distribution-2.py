# Enter your code here. Read input from STDIN. Print output to STDOUT
p = 1 / 3
q = 1 - p
n = 5
g = 0
for i in range(1, n+1):
    g += q**(i-1) * p

print(round(g, 3))
