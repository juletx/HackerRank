import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void isWeird(int n){
        String answer = "";
        if(n % 2 == 1 || (n >= 6 && n <= 20)){
            answer = "Weird";
        }
        else{
            answer = "Not Weird";
        }
        System.out.println(answer);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        isWeird(N);
        scanner.close();
    }
}
