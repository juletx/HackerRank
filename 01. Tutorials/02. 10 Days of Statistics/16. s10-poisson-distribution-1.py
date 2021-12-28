# Enter your code here. Read input from STDIN. Print output to STDOUT
from math import e, factorial
mean = 2.5
k = 5
p = (mean**k * e**(-mean)) / factorial(k)
print(round(p, 3))
