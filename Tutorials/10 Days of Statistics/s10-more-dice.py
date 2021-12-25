from fractions import Fraction
# Find all possible outcomes
list_all = [(x,  y) for x in range(1, 7) for y in range(1, 7)]

# from list_all find the outcomes where x + y equals 6
step1 = [(x, y) for x, y in list_all if x + y == 6]

# from step1 find the outcomes where x is not equal to y
step2 = [(x, y) for x, y in step1 if x != y]

# calculate the probability
print(Fraction(len(step2), len(list_all)))
