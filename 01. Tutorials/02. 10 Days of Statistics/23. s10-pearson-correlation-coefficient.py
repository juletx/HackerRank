# Enter your code here. Read input from STDIN. Print output to STDOUT
import statistics as st
n = int(input())
x = list(map(float, input().strip().split()))
y = list(map(float, input().strip().split()))

mean_x = st.mean(x)
mean_y = st.mean(y)
std_x = st.pstdev(x)
std_y = st.pstdev(y)

cov = sum([(x[i] - mean_x) * (y[i] - mean_y) for i in range(n)])
cor = cov / (n * std_x * std_y)

print(round(cor, 3))
