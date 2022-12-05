# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
x = list(map(float, input().strip().split()))
y = list(map(float, input().strip().split()))

rank_x = [sorted(x).index(e) + 1 for e in x]
rank_y = [sorted(y).index(e) + 1 for e in y]

distance = sum([(rank_x[i] - rank_y[i]) ** 2 for i in range(n)])

spearman = 1 - (6 * distance) / (n * (n ** 2 - 1))

print(round(spearman, 3))
