import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(doGame(a,b));

    }

    private static String doGame(int a, int b) {
        if ((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
            return "A";
        } else {
            return "B";
        }
    }
}