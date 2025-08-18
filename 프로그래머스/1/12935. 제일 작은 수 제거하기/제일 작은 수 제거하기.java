class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        if (n == 1) return new int[] {-1};
        
        int minIdx = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
        }
        
        int[] answer = new int[n - 1];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i == minIdx) continue;
            answer[j++] = arr[i];
        }
        
        return answer;
    }
}