class Solution {
    public int solution(String s) {
        String[] numWords = {"zero", "one", "two", "three", "four", "five", "six",
                            "seven", "eight", "nine"};
        
        for (int i = 0; i < numWords.length; i++) {
            s = s.replaceAll(numWords[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}