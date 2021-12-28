import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int integerToBinary(int n){
        int max = 0;
        int cons = 0;
        int rem;
        while (n > 0){
            rem = n % 2;
            if (rem == 1){
                cons++;
                if (cons > max){
                    max = cons;
                }
            }
            else{
                cons = 0;
            }
            n = n / 2;     
        }
        return max;  
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(integerToBinary(n));
        scanner.close();
    }
}
