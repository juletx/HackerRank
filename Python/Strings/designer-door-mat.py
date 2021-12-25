# Enter your code here. Read input from STDIN. Print output to STDOUT
if __name__ == "__main__":
    inp = input().split()
    n = int(inp[0])
    m = int(inp[1])
    
    for i in range(n // 2):
        print((".|."*((i+1)*2-1)).center(m, "-"))
    
    print("WELCOME".center(m, "-"))
    
    for i in range(n // 2):
        print((".|."*((n//2-i)*2-1)).center(m, "-"))
