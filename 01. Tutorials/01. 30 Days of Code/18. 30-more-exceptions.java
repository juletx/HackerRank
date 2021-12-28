

//Write your code here
class Calculator{
    int power(int n, int p) throws Exception{
        if (n < 0 || p < 0)
            throw new Exception("n and p should be non-negative");
        if (p == 0)
            return 1;
        if (p % 2 == 0) 
            return power(n, p/2) * power(n, p/2);
        else
            return n * power(n, p/2) * power(n, p/2);
    }
}

