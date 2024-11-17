import java.util.*;
import java.io.*;
public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int testCase = 1; testCase <= T; testCase++) {
			Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int[] scoreCnt = new int[101];
			
			for(int i = 0; i < 1000; i++) {
				scoreCnt[Integer.parseInt(st.nextToken())]++;
			}
			
			int max = Integer.MIN_VALUE;
			int maxScore = 0;
			
			for (int i = 1; i < 101; i++) {
				if(scoreCnt[i] > max || (scoreCnt[i] == max && i > maxScore)) {
					max = scoreCnt[i];
					maxScore = i;
				}
			}
			
			sb.append("#").append(testCase).append(" ").append(maxScore).append("\n");
		}
		System.out.println(sb.toString());
	}
}
