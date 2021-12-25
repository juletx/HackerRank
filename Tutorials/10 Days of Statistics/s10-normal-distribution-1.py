# Enter your code here. Read input from STDIN. Print output to STDOUT
import math
mean, std = 20, 2
def normal(x):
    return 0.5 * (1 + math.erf((x - mean) / (std * (2 ** 0.5))))

print(round(normal(19.5), 3))
print(round(normal(22) - normal(20), 3))
