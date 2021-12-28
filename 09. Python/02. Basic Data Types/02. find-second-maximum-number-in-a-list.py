if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    
    runner = -100
    max = -100
    
    for x in arr:
        if x > max:
            runner = max
            max = x
        elif x > runner and x < max:
            runner = x
    print(runner)
            
    
