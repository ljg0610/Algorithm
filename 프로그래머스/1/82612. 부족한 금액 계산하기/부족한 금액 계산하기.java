class Solution {
    public long solution(int price, int money, int count) {
        long p = price;
        long c = count;
        long total = p * c * (c + 1) / 2;
        long answer = total <= money ? 0 : total - money;

        return answer;
    }
}