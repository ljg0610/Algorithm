import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] room = new char[n][n];

        int rCnt = 0;
        int cCnt = 0;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                room[i][j] = line.charAt(j);
            }
        }

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

        StringBuilder sb = new StringBuilder();
        sb.append(rCnt).append(' ').append(cCnt);

        System.out.println(sb.toString());
    }
}