#!/bin/python3

t = int(input().strip())
for _ in range(t):
    n = int(input().strip())
    three = (n - 1) // 3
    five = (n - 1) // 5
    fifteen = (n - 1) // 15

    sum_three = 3 * (three * (three + 1) // 2)
    sum_five = 5 * (five * (five + 1) // 2)
    sum_fifteen = 15 * (fifteen * (fifteen + 1) // 2)

    print(sum_three + sum_five - sum_fifteen)
