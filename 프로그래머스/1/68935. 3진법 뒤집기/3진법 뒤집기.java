class Solution {
    public int solution(int n) {
        String s = Integer.toString(n, 3);
        String tmp = new StringBuilder(s).reverse().toString();
        
        return Integer.parseInt(tmp, 3);
    }
}