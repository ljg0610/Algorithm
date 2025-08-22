class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int cnt = food[i] / 2;
            for (int j = 0; j < cnt; j++) {
                left.append(i);
            }
        }
        
        String right = new StringBuilder(left).reverse().toString();
        
        return left.append('0').append(right).toString();
    }
}