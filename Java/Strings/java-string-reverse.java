import java.io.*;
import java.util.*;

public class Solution {

    public static String isPalindrome(String word, int first, int last){       
        return isPalindRecursive(word.toLowerCase(), first, last);
    }    

    private static String isPalindRecursive(String word, int first, int last){                
        if (first >= last){
            return "Yes"; 
        }              
        if (word.charAt(first) != word.charAt(last)){
            return "No";
        }
        first++;
        last--;
        return isPalindRecursive(word, first, last); 
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String result = isPalindrome(A, 0, A.length()-1);        
        System.out.println(result);
        
    }
}



