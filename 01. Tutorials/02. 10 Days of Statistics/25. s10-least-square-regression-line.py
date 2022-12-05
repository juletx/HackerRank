import statistics as st
n = 5
x = [95, 85, 80, 70, 60]
y = [85, 95, 70, 65, 70]

mean_x = st.mean(x)
mean_y = st.mean(y)
x_sum, y_sum = sum(x), sum(y)

x_sqr_sum = sum(i**2 for i in x)
xy_sum = sum(i*j for i,j in zip(x, y))

b = (n * xy_sum - x_sum * y_sum)/(n * x_sqr_sum - x_sum**2)
a = mean_y - b * mean_x

y_hat = a + 80 * b

print(round(y_hat, 3))
