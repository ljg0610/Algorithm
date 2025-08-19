class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        long num = price;
        int cnt = 2;
        
        while (cnt < count + 1) {
            num += (long) (price * cnt++);
        }
        
        
        if (num <= money) {return 0;}
        
        answer = Math.abs(num - money);

        return answer;
    }
}