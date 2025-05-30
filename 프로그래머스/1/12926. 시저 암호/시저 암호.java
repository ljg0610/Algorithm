class Solution {
    public String solution(String s, int n) {
        char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l',
                                     'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                                     'w', 'x', 'y', 'z'};
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                sb.append(c);
            } else {
                for (int j = 0; j < alphabet.length; j++) {
                    if (alphabet[j] == c) {
                        char ch = alphabet[(j + n) % 26];
                        sb.append(ch);
                        break;
                    } else if (Character.toUpperCase(alphabet[j]) == c) {
                        char ch = alphabet[(j + n) % 26];
                        sb.append(Character.toUpperCase(ch));
                        break;
                    }
                }
            }
        }
        
        return sb.toString();
    }
}