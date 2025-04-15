import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        List<Integer> numList = new ArrayList<>();
        
        for (int i = n; i <= m; i++) {
            numList.add(i);
        }

        numList.sort((a,b) -> {
            String aStr, bStr;
            if (a >= 10) {
                aStr = numStr[a / 10] + " " + numStr[a%10];
            } else {
                aStr = numStr[a];
            }
            if (b >= 10) {
                bStr = numStr[b / 10] + " " + numStr[b%10];
            } else {
                bStr = numStr[b];
            }

            return aStr.compareTo(bStr);
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numList.size(); i++) {
            sb.append(numList.get(i)).append(' ');
            if ((i+1) % 10 == 0) sb.append('\n');
        }

        System.out.println(sb);
    }
}