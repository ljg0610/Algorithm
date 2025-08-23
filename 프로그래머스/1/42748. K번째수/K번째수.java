import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        
        for (int[] cmd : commands) {
            int i = cmd[0];
            int j = cmd[1];
            int k = cmd[2];
            int[] slice = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(slice);
            answer[idx++] = slice[k-1];
        }
        return answer;
    }
}