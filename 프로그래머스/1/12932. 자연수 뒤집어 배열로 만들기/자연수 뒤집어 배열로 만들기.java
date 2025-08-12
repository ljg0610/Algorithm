class Solution {
    public int[] solution(long n) {
        char[] ch = String.valueOf(n).toCharArray();
        int[] answer = new int[ch.length];
        int idx = 0;
        
        for (int i = ch.length - 1; i >=0; i--) {
            answer[idx++] = ch[i] - '0';
        }
        
        return answer;
    }
}