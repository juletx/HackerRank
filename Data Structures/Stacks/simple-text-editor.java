import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String s = "";
        Stack<String> pila = new Stack<String>();
        
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        
        for(int i=0; i<q; i++){
            int t = scan.nextInt();
            switch (t){
                case 1:
                    String w = scan.next();
                    pila.push(s);
                    s += w;
                    break;
                case 2:
                    int k1 = scan.nextInt();
                    pila.push(s);
                    s = s.substring(0, s.length()-k1);
                    break;
                case 3:
                    int k2 = scan.nextInt();
                    System.out.println(s.charAt(k2-1));
                    break;
                case 4:
                    s = pila.pop();
                    break;
            }
        }
        scan.close();
    }
}