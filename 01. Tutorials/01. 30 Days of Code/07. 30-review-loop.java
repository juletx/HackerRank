import java.io.*;
import java.util.*;

public class Solution {

    static void printEvenOdd(String s){
        String even = "";
        String odd = "";
        char[] charArray = s.toCharArray();
        for (int i=0; i<s.length(); i++){
            if (i % 2 == 0){
                even += charArray[i];
            }
            else{
                odd += charArray[i];
            }
        }
        System.out.println(even + " " + odd);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i=0; i<t; i++){
            printEvenOdd(scan.next());
        }
        scan.close();
    }
}

