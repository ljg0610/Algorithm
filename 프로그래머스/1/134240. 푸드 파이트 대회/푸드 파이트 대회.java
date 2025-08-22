class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int num = food[i] / 2;
            for (int j = 0; j < num; j++) {
                sb.append(i);
            }
        }
        
        sb.append('0');
        
        for (int i = sb.toString().length() - 2; i >= 0; i--) {
            sb.append(sb.toString().charAt(i));
        }
        
        return sb.toString();
    }
}