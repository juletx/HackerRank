if __name__ == '__main__':
    s = input()
    
    alnum = False
    alpha = False
    digit = False
    lower = False
    upper = False
    
    for c in s:
        if c.isalnum():
            alnum = True
        if c.isalpha():
            alpha = True
        if c.isdigit():
            digit = True
        if c.islower():
            lower = True
        if c.isupper():
            upper = True
    
    print(alnum)
    print(alpha)
    print(digit)
    print(lower)
    print(upper)
