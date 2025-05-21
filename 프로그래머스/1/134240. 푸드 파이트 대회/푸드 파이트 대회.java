class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int amount = food[i];
            for (int j = 0; j < amount / 2; j++) {
                sb.append(i);
            }
        }
        
        String nSb = new StringBuilder(sb).reverse().toString();
        
        return sb.append(0).append(nSb).toString();
    }
}