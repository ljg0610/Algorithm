class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < str.length; i++) {
            int num = Integer.parseInt(str[i]);
            if (num > max) {
                max = num;
            } 
            if (num < min) {
                min = num;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(min).append(' ').append(max);
        return sb.toString();
    }
}