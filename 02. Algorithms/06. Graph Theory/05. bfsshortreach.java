import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the bfs function below.
    static int[] bfs(int n, int m, int[][] edges, int s) {
        int erpin, azkena;
        int distantzia=0;
        List<Integer>[] auzokoak = (List<Integer>[]) new LinkedList[n+1];
        int[] emaitza = new int[n+1];
        boolean[] bisitatua = new boolean[n+1];
        int[] result = new int[n+1];
        for (int i=0; i < auzokoak.length; i++) {
            auzokoak[i]=new LinkedList<Integer>();
        }
        for(int i=0;i<m;i++){
            int nondik = edges[i][0];
            int nora = edges[i][1];
            if(!auzokoak[nondik].contains(nora)){
                auzokoak[nondik].add(nora);
                auzokoak[nora].add(nondik);
            }
        }
        Queue<Integer[]> ilara  = new LinkedList<Integer[]>();
        Queue<Integer[]> lagunIlara  = new LinkedList<Integer[]>();
        Integer[] lenengo = new Integer[2];
        Integer[] oraingo;
        lenengo[0]=s;
        lenengo[1]=1;
        ilara.add(lenengo);
        bisitatua[s]=true;
        while(!ilara.isEmpty()){
            oraingo=ilara.poll();
            erpin=oraingo[0];
            azkena=oraingo[1];
            emaitza[erpin]=distantzia;
            if(azkena==1){
                distantzia+=6;
            }
            for(int v=0; v<auzokoak[erpin].size(); v++){
                int auzokide = auzokoak[erpin].get(v);
                if(!bisitatua[auzokide]){
                    Integer[] sartzeko = new Integer[2];
                    sartzeko[0]=auzokide;
                    sartzeko[1]=0;
                    lagunIlara.add(sartzeko);
                    bisitatua[auzokide]=true;

                }

            }

            if(azkena==1){
                while(!lagunIlara.isEmpty()){
                    Integer[] lag = lagunIlara.poll();
                    if(lagunIlara.isEmpty()){
                        lag[1]=1;
                    } 
                    ilara.add(lag);

                }

            }
        }
        int[] emaitzaFinala = new int[n-1];
        int indize=0;
        for(int i=0; i<emaitzaFinala.length+1; i++){
           if(i+1!=s){
                if(emaitza[i+1]==0){
                    emaitzaFinala[indize]=-1;
                }else{
                    emaitzaFinala[indize]=emaitza[i+1];
                }
                indize++;
           }

        }
        return emaitzaFinala;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int[][] edges = new int[m][2];

            for (int i = 0; i < m; i++) {
                String[] edgesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int edgesItem = Integer.parseInt(edgesRowItems[j]);
                    edges[i][j] = edgesItem;
                }
            }

            int s = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = bfs(n, m, edges, s);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
