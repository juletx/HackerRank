# Enter your code here. Read input from STDIN. Print output to STDOUT
import math
mean, std = 70, 10
def normal(x):
    return 0.5 * (1 + math.erf((x - mean) / (std * (2 ** 0.5))))

print(round((1-normal(80))*100,2))
print(round((1-normal(60))*100,2))
print(round((normal(60))*100,2))
