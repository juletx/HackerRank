#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())

    if n % 2 == 1:
        print("Weird")
    elif n in range(2, 6):
        print("Not Weird")
    elif n in range(6, 21):
        print("Weird")
    elif n > 20:
        print("Not Weird")
