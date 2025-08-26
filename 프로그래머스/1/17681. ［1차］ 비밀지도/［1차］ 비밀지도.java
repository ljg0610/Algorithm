class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            int row = arr1[i] | arr2[i];
            StringBuilder sb = new StringBuilder();
            for (int j = n - 1; j >= 0; j--) {
                sb.append(((row >> j) & 1) == 1 ? '#' : ' ');
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}