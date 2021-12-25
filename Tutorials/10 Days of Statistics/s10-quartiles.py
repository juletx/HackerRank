#!/bin/python3

import math
import os
import random
import re
import sys
from statistics import median

#
# Complete the 'quartiles' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY arr as parameter.
#

def quartiles(arr):
    # Write your code here
    arr.sort()
    n = len(arr)
    mid = n // 2
    
    if n % 2 == 0:
        lower = arr[:mid]
        upper = arr[mid:]
    else:
        lower = arr[:mid]
        upper = arr[mid+1:]
    
    q1 = int(median(lower))
    q2 = int(median(arr))
    q3 = int(median(upper))
    
    return [q1, q2, q3]

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    data = list(map(int, input().rstrip().split()))

    res = quartiles(data)

    fptr.write('\n'.join(map(str, res)))
    fptr.write('\n')

    fptr.close()
