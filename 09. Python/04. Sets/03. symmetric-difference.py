# Enter your code here. Read input from STDIN. Print output to STDOUT
m = int(input())
a = set(list(map(int, input().split())))
n = int(input())
b = set(list(map(int, input().split())))

diff_a_b = a.difference(b)
diff_b_a = b.difference(a)

sorted_diff = sorted(diff_a_b.union(diff_b_a))

for i in sorted_diff:
    print(i)
