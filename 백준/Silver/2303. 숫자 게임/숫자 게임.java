import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        final int GIVEN = 5;

        int n = Integer.parseInt(br.readLine());

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            
            int[] cards = new int[GIVEN];
            for (int j = 0; j < GIVEN; j++) {
                cards[j] = Integer.parseInt(st.nextToken());
            }

            int max = 0;
            for (int a = 0; a < GIVEN; a++) {
                for (int b = 0; b < GIVEN; b++) {
                    if (b == a) continue;
                    for (int c = 0; c < GIVEN; c++) {
                        if (c == b || c == a) continue;

                        int sum = cards[a] + cards[b] + cards[c];

                        max = Math.max(max, sum % 10);
                    }
                }
            }
            result[i] = max;
        }

        int no = 0;
        int card = 0;

        for (int i = 0; i < n ; i++) {
            if (result[i] >= card) {
                no = i;
                card = result[i];
            }
        }

        System.out.println(no + 1);
    }
}