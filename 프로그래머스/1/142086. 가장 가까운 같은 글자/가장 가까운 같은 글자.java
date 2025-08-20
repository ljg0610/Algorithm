class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < answer.length; i++) {
            boolean flag = true;
            int idx = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    flag = false;
                    idx = i - j;
                    break;
                }
            }
            if (flag) {
                answer[i] = -1;
            } else {
                answer[i] = idx;
                idx = 0;
            }
        }
        return answer;
    }
}