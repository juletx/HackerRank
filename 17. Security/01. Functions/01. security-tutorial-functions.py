#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'calculate' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER x as parameter.
#

def calculate(x):
    return x % 11

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    x = int(input().strip())

    result = calculate(x)

    fptr.write(str(result) + '\n')

    fptr.close()
