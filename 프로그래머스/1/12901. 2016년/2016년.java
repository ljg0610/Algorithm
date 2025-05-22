class Solution {
    public String solution(int a, int b) {
        int[] days = new int[] {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[] {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int sum = 0;
        for (int i = 1; i < a; i++) {
            sum += days[i];
        }
        sum += b;
        
        String answer = day[(sum - 1) % 7];
        return answer;
    }
}