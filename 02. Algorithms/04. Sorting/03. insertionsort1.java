import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int azkena = arr[n-1];
        int i = n-1;
        while(i>0 && arr[i-1]>azkena){
            arr[i] = arr[i-1];
            for(int j=0; j<n; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
            i--;
        }  
        arr[i] = azkena;
        for(int j=0; j<n; j++){
            System.out.print(arr[j] + " ");
        }    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}
