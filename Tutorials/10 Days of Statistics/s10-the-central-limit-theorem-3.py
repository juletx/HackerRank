# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
mean = int(input())
sd = int(input())
p = float(input())
z = float(input())

sd_sample = sd / (n**0.5)
print(round(mean - sd_sample*z, 2))
print(round(mean + sd_sample*z, 2))
