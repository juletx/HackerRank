import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        /*
         * Write your code here.
         */
        Stack<Integer> p1 = new Stack<Integer>();
        Stack<Integer> p2 = new Stack<Integer>();
        Stack<Integer> p3 = new Stack<Integer>();
        int bat1 = 0, bat2 = 0, bat3 = 0;
        for(int i=h1.length-1; i>=0; i--){
            bat1 += h1[i];
            p1.push(h1[i]);
        }
        for(int i=h2.length-1; i>=0; i--){
            bat2 += h2[i];
            p2.push(h2[i]);
        }
        for(int i=h3.length-1; i>=0; i--){
            bat3 += h3[i];
            p3.push(h3[i]);
        }
        while(!(bat1==bat2 && bat1==bat3)){           
            if(bat1>=bat2 && bat1>=bat3){
                bat1 -= p1.pop();
            }
            else if(bat2>=bat1 && bat2>=bat3){
                bat2 -= p2.pop();
            }
            else{
                bat3 -= p3.pop();
            }
        }
        return bat1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
