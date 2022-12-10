#!/usr/bin/python

def displayPathtoPrincess(n, grid):
    # Find the location of the bot and the princess
    for i in range(n):
        for j in range(n):
            if grid[i][j] == 'm':
                x, y = i, j
            if grid[i][j] == 'p':
                a, b = i, j

    # Compute the required moves
    if x > a:
        for i in range(x - a):
            print('UP')
    elif x < a:
        for i in range(a - x):
            print('DOWN')

    if y > b:
        for i in range(y - b):
            print('LEFT')
    elif y < b:
        for i in range(b - y):
            print('RIGHT')

m = int(input())
grid = [] 
for i in range(0, m): 
    grid.append(input().strip())

displayPathtoPrincess(m,grid)
