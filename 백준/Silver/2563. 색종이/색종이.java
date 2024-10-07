import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] colorPaper = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            colorPaper[i][0] = Integer.parseInt(st.nextToken());
            colorPaper[i][1] = Integer.parseInt(st.nextToken());
        }

        checker(colorPaper);
    }

    static void checker(int[][] colorPaper){
        int[][] paper = new int[100][100];
        int area = 0;

        for (int[] coord : colorPaper) {
            int x = coord[0];
            int y = coord[1];

            for(int i = x; i < x + 10; i++){
                for (int j = y; j < y + 10; j++) {
                    if(paper[i][j] == 0){
                        paper[i][j] = 1;
                        area++;
                    }
                }
            }
        }
        System.out.println(area);
    }
}