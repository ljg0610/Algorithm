import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] coord = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            coord[i][0] = Integer.parseInt(st.nextToken());
            coord[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(coord, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b){
                if(b[1] == a[1]){
                    return a[0] - b[0];
                }else{
                    return a[1] - b[1];
                }
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(coord[i][0] + " " + coord[i][1]);
        }
    }
}