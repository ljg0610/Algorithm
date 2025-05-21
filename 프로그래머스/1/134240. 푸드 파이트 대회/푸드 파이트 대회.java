class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int amount = food[i];
            for (int j = 0; j < amount / 2; j++) {
                sb.append(i);
            }
        }
        
        String s = sb.toString();
        String reversed = sb.reverse().toString();
        
        sb.setLength(0);
        
        sb.append(s).append(0).append(reversed);
        
        
        
        return sb.toString();
    }
}