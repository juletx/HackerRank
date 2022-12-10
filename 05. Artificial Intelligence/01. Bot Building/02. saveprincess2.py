#!/usr/bin/python

def nextMove(n,r,c,grid):
    # Find the location of the bot and the princess
    for i in range(n):
        for j in range(n):
            if grid[i][j] == 'm':
                x, y = i, j
            if grid[i][j] == 'p':
                a, b = i, j

    # Compute the next move
    if x > a:
        return 'UP'
    elif x < a:
        return 'DOWN'

    if y > b:
        return 'LEFT'
    elif y < b:
        return 'RIGHT'

n = int(input())
r,c = [int(i) for i in input().strip().split()]
grid = []
for i in range(0, n):
    grid.append(input())

print(nextMove(n,r,c,grid))
