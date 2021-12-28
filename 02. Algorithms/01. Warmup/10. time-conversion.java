import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] time = s.split(":");
        int hh = Integer.parseInt(time[0]);
        int mm = Integer.parseInt(time[1]);
        int ss = Integer.parseInt(time[2].substring(0, 2));
        String AMPM = time[2].substring(2, 4);
        int h = hh;
        if (AMPM.equals("AM") && hh == 12)
            h = 0;
        else if (AMPM.equals("PM") && hh < 12)
            h += 12;
        return String.format("%02d:%02d:%02d", h, mm, ss);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
