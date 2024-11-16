import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int testCase = 1 ; testCase <= T; testCase++) {
            int n = Integer.parseInt(br.readLine());
            int[] scores = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++) {
                scores[i] = Integer.parseInt(st.nextToken());
            }

            HashSet<Integer> possibleScoreSet = new HashSet<>();
            possibleScoreSet.add(0);

            for(int score : scores) {
                ArrayList<Integer> currentScore = new ArrayList<>(possibleScoreSet);

                for(int sum : currentScore) {
                    possibleScoreSet.add(sum + score);
                }
            }

            System.out.println("#" + testCase + " " + possibleScoreSet.size());
        }
	}
}