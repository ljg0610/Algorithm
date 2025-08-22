class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        
        for (int[] s : sizes) {
            int big = Math.max(s[0], s[1]);
            int small = Math.min(s[0], s[1]);
            
            if (big > maxW) maxW = big;
            
            if (small > maxH) maxH = small;
        }
        
        return maxW * maxH;
    }
}