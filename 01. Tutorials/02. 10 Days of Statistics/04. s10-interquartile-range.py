#!/bin/python3

import math
import os
import random
import re
import sys
from statistics import median

#
# Complete the 'interQuartile' function below.
#
# The function accepts following parameters:
#  1. INTEGER_ARRAY values
#  2. INTEGER_ARRAY freqs
#

def interQuartile(values, freqs):
    # Print your answer to 1 decimal place within this function
    arr = []
    
    for i, v in enumerate(values):
        arr.extend([v]*freqs[i])
    
    arr.sort()
    n = len(arr)
    mid = n // 2
    
    if n % 2 == 0:
        lower = arr[:mid]
        upper = arr[mid:]
    else:
        lower = arr[:mid]
        upper = arr[mid+1:]
    
    q1 = median(lower)
    q3 = median(upper)
    
    print(round(float(q3 - q1), 1))


if __name__ == '__main__':
    n = int(input().strip())

    val = list(map(int, input().rstrip().split()))

    freq = list(map(int, input().rstrip().split()))

    interQuartile(val, freq)
