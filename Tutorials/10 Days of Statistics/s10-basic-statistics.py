# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
x = [int(v) for v in input().split()]
mean = round(sum(x) / len(x), 1)
print(mean)

sort = sorted(x)
if n % 2 != 0:
    median = round(sort[n//2], 1)
else:
    median = round((sort[n//2-1] + sort[n//2]) / 2, 1)
print(median)

from collections import Counter
counts = Counter(sort)
mode = max(counts, key=counts.get)
print(mode)
