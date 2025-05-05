import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabetNums = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

        char[] A = br.readLine().toCharArray();
        char[] B = br.readLine().toCharArray();

        int len = A.length;
        int[] merged = new int[len * 2];
        
        for (int i = 0; i < len; i++) {
            merged[i * 2] = alphabetNums[A[i] - 'A'];
            merged[i * 2 + 1] = alphabetNums[B[i] - 'A'];
        }

        while (merged.length > 2) {
            int[] next = new int[merged.length - 1];

            for (int i = 0; i < next.length; i++) {
                next[i] = (merged[i] + merged[i + 1]) % 10;
            }
            
            merged = next;
        }

        System.out.println(merged[0] + "" + merged[1]);
    }
}