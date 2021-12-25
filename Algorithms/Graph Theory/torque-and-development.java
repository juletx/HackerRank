import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static List<Integer>[] auzokideak;
    static boolean[] bisitatuak;

    // Complete the roadsAndLibraries function below.
    static long roadsAndLibraries(int n, long c_lib, long c_road, int[][] cities) {
        long kostua = 0;
        if (c_lib <= c_road)
            kostua = n*c_lib;
        else {
            auzokideak = new LinkedList[n+1];
            for (int i=0; i<auzokideak.length; i++) {
                auzokideak[i] = new LinkedList<Integer>();
            }

            for (int j=0; j<cities.length; j++) {
                int hiri1 = cities[j][0];
                int hiri2 = cities[j][1];
                if (!auzokideak[hiri1].contains(hiri2)){
                    auzokideak[hiri1].add(hiri2);
                    auzokideak[hiri2].add(hiri1);
                }  
            }

            bisitatuak = new boolean[n+1];
            for (int k=1; k<n+1; k++) {
                if (!bisitatuak[k])    
                    kostua += c_lib + road_cost(k, c_road);      
            }  
        }
        return kostua;
    }

    static long road_cost(int hiri, long c_road) { 
        long kostua = 0;
        bisitatuak[hiri] = true;

        for (int i=0; i<auzokideak[hiri].size(); i++) {
            int auzokide = auzokideak[hiri].get(i);
            if (!bisitatuak[auzokide]) {
                bisitatuak[auzokide] = true;
                kostua += c_road + road_cost(auzokide, c_road);
            }
        }
        return kostua;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nmC_libC_road = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmC_libC_road[0]);

            int m = Integer.parseInt(nmC_libC_road[1]);

            int c_lib = Integer.parseInt(nmC_libC_road[2]);

            int c_road = Integer.parseInt(nmC_libC_road[3]);

            int[][] cities = new int[m][2];

            for (int i = 0; i < m; i++) {
                String[] citiesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int citiesItem = Integer.parseInt(citiesRowItems[j]);
                    cities[i][j] = citiesItem;
                }
            }

            long result = roadsAndLibraries(n, c_lib, c_road, cities);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
