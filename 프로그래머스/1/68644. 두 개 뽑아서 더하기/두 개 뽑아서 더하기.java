class Solution {
    public int[] solution(int[] numbers) {
        boolean[] seen = new boolean[201];
        int n = numbers.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                seen[numbers[i] + numbers[j]] = true;
            }
        }
        
        int cnt = 0;
        for (boolean b : seen) {
            if (b) cnt++;
        }
        
        int[] answer = new int[cnt];
        int idx = 0;
        for (int i = 0; i < seen.length; i++) {
            if (seen[i]) answer[idx++] = i;
        }
        
        return answer;
    }
}