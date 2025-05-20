class Solution {
    public int solution(int n) {
        int tmp = 3;
        String s = Integer.toString(n, tmp);
        StringBuilder sb = new StringBuilder(new String(s));

        sb.reverse();
        
        s = sb.toString();
        int answer = 0;
        int idx = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            answer += Math.pow(tmp, idx++) *  Integer.parseInt(s.substring(i, i+1));
        }
        
        return answer;
    }
}