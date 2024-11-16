import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        Map<Character, Integer> holeMap = new HashMap<>();
        for(char c : "ADOPQR".toCharArray()) {
            holeMap.put(c, 1);
        }
        holeMap.put('B', 2);

        for(int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String first = st.nextToken();
            String second = st.nextToken();

            if(first.length() != second.length()) {
                System.out.println("#" + testCase + " DIFF");
                continue;
            }

            boolean isSame = true;
            for (int i = 0; i < first.length(); i++) {
                char charA = first.charAt(i);
                char charB = second.charAt(i);
                
                if(holeMap.getOrDefault(charA, 0) != holeMap.getOrDefault(charB,0)) {
                    isSame = false;
                }
            }

            if(isSame) {
                System.out.println("#" + testCase + " SAME");
            } else {
                System.out.println("#" + testCase + " DIFF");
            }

        }
    }
}
