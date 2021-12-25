# Enter your code here. Read input from STDIN. Print output to STDOUT
import math
weight = 9800
boxes = 49
mean = 205
std = 15

mean_n = boxes * mean
std_n = math.sqrt(boxes) * std

def normal(x):
    return 0.5 * (1 + math.erf((x - mean_n) / (std_n * (2 ** 0.5))))

print(round((normal(9800)), 4))

