class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] bSection = new boolean[n + 1];
        
        for (int idx : section) {
            bSection[idx] = true;
        }
        
        for (int i = 1; i <= n; i++) {
            if (bSection[i]) {
                int range = i + m - 1 <= n ? i + m - 1 : n;
                for (int j = i; j <= range; j++) {
                    bSection[j] = false;
                }
                answer++;
            }
        }
        
        return answer;
    }
}