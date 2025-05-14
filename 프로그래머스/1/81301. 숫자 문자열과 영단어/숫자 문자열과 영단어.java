class Solution {
    public int solution(String s) {
        String[] numberWords = {"zero", "one", "two", "three", "four", 
                               "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < numberWords.length; i++) {
            s = s.replaceAll(numberWords[i], String.valueOf(i));
        }
        
        return Integer.parseInt(s);
    }
}