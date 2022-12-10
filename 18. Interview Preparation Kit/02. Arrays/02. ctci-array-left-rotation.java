import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        scanner.close();
        
        // Array laguntzailea
        int[] lag = new int[n]; 
        
        // Arrayan ezkerretik eskuinera n-d posizio mugitu behar direnak
        for (int i = 0; i < d; i++){ 
            lag[n-d+i] = a[i];
        }
        
        // Arrayan eskuinetik ezkerrera d posizio mugitu behar direnak
        for (int j = 0; j < n-d; j++){ 
            lag[j] = a[d+j];
        }       
        
        // Arraya inprimatu
        for (int k = 0; k < n; k++){
            System.out.print(lag[k] + " ");  
        }
    }
}
