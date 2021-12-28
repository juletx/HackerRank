import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        LinkedList<Integer> ilara = new LinkedList<Integer>();
        for(int i=0;i<q;i++){
            int aukera = scan.nextInt();
            switch (aukera){
                case 1:
                    int x = scan.nextInt();
                    ilara.add(x);
                    break;
                case 2:
                    ilara.poll();
                    break;
                case 3:
                    System.out.println(ilara.peek());
                    break;
            }
        }
    }
}