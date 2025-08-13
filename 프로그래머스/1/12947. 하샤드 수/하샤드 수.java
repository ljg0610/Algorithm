class Solution {
    public boolean solution(int x) {
        String s = Integer.toString(x);
        
        int num = 0;
        for (char c : s.toCharArray()) {
            num += c - '0';
        }
        
        if (x % num == 0) {
            return true;
        }
        
        return false;
    }
}