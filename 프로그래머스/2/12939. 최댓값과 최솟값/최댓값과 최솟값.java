class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < str.length; i++) {
            int num = Integer.parseInt(str[i]);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        String answer = min + " " + max;
        return answer;
    }
}