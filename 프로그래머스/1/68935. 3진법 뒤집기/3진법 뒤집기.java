class Solution {
    public int solution(int n) {
        String start = Integer.toString(n, 3);
        String tmp = new StringBuilder(start).reverse().toString();
        int answer = 0;
        
        int idx = 0;
        for (int i = tmp.length() - 1; i >= 0; i--) {
            answer += Math.pow(3, idx++) * Integer.parseInt(tmp.substring(i, i + 1));
        }
        
        return answer;
    }
}