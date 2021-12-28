import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        if (n == 2){
            return true;
        }
        if (n % 2 == 0){
            return false;
        }
        for (int i=3; i<=Math.sqrt(n); i+=2){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            if (isPrime(scan.nextInt())){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }
        scan.close();
    }
}

