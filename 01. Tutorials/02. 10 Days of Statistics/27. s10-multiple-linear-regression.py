from sklearn import linear_model

m, n = map(int, input().strip().split())
x, y = [], []
for _ in range(n):
    *features, y_val = map(float, input().strip().split())
    x.append(features)
    y.append(y_val)

q = int(input())
x_pred = []
for _ in range(q):
    features = list(map(float, input().strip().split()))
    x_pred.append(features)
    
lm = linear_model.LinearRegression()
lm.fit(x, y)
y_pred = lm.predict(x_pred)

for num in y_pred:
    print(round(num, 2))
