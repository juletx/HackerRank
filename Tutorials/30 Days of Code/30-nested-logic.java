import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int dayRet = scan.nextInt();
        int monthRet = scan.nextInt();
        int yearRet = scan.nextInt();
        int dayExp = scan.nextInt();
        int monthExp = scan.nextInt();
        int yearExp = scan.nextInt();

        int fine;
        if(yearRet < yearExp){
            fine = 0;
        }
        else if(yearRet == yearExp){
            if(monthRet > monthExp){
                fine = 500 * (monthRet - monthExp);
            }
            else if(dayRet > dayExp){
                fine = 15 * (dayRet - dayExp);
            }
            else{
                fine = 0;
            }
        }
        else{
            fine = 10000;
        }
        System.out.println(fine);

        scan.close();
    }
}

