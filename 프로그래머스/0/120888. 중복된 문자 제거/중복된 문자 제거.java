class Solution {
    public String solution(String my_string) {
        String[] str = my_string.split("");
        String answer = str[0];
        for(int i = 1; i < str.length; i++){
            if(!answer.contains(str[i])){
                answer += str[i];
            }
        }
        return answer;  
    }
}