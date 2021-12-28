# Enter your code here. Read input from STDIN. Print output to STDOUT
import math
x = int(input())
n = int(input())
mean = float(input())
std = float(input())

mean_n = n * mean
std_n = math.sqrt(n) * std

def normal(x, mean, std):
    return 0.5 * (1 + math.erf((x - mean) / (std * (2 ** 0.5))))

print(round(normal(x, mean_n, std_n), 4))
