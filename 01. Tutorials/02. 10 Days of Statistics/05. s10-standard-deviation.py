#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'stdDev' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def stdDev(arr):
    # Print your answers to 1 decimal place within this function
    mean = sum(arr) / len(arr)
    add = 0
    for i in range(len(arr)):
        add += (arr[i] - mean)**2
    
    sd = math.sqrt(add / len(arr))
    print(round(sd, 1))

if __name__ == '__main__':
    n = int(input().strip())

    vals = list(map(int, input().rstrip().split()))

    stdDev(vals)
