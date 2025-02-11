import java.io.*;
public class Main {
    static int n;
    static int rCnt;
    static int cCnt;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        char[][] room = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                room[i][j] = line.charAt(j);
            }
        }
        
        searchRow(room);
        searchCol(room);

        StringBuilder sb = new StringBuilder();
        sb.append(rCnt).append(' ').append(cCnt);

        System.out.println(sb.toString());
    }

    private static void searchRow(char[][] room) {
        for (int i = 0; i < n; i++) {
            int rSeq = 0;
            for (int j = 0; j < n; j++) {
                if (room[i][j] == '.') {
                    rSeq++;
                } else {
                    if (rSeq > 1) {
                        ++rCnt;
                    }
                    rSeq = 0;
                }
            }
            if (rSeq > 1) {
                ++rCnt;
            }
        }
    }

    private static void searchCol(char[][] room) {
        for (int i = 0; i < n; i++) {
            int cSeq = 0;
            for (int j = 0; j < n; j++) {
                if(room[j][i] == '.') {
                    cSeq++;
                } else {
                    if (cSeq > 1) {
                        ++cCnt;
                    }
                    cSeq = 0;
                }
            }
            if (cSeq > 1) {
                ++cCnt;
            }
        }
    }
}