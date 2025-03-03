import java.io.*;

public class Main {
    static char[] vowel = {'a', 'e', 'i', 'o', 'u'};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder sb = new StringBuilder();
        
        while(!(input = br.readLine()).equals("end")) {
            if (isAcceptable(input)) {
                sb.append("<").append(input).append("> is acceptable.\n");
            } else {
                sb.append("<").append(input).append("> is not acceptable.\n");
            }
        }
        System.out.println(sb);
    }

    private static boolean isAcceptable (String input) {
        return containsVowel(input) && continuousWords(input) && chkSame(input);
    }

    private static boolean containsVowel(String input) {
        for (char c : input.toCharArray()) {
            for (char v : vowel) {
                if (c == v) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean continuousWords(String input) {
        if (input.length() < 3) {
            return true;
        }

        for (int i = 2; i < input.length(); i++) {
            boolean first = isVowel(input.charAt(i-2));
            boolean second = isVowel(input.charAt(i-1));
            boolean third = isVowel(input.charAt(i));

            if ((first && second && third) || (!first && !second && !third)) {
                return false;
            }
        }
        return true;
    }

    private static boolean chkSame(String input) {
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i-1) == input.charAt(i)) {
                if (input.charAt(i) != 'e' && input.charAt(i) != 'o') {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isVowel(char c) {
        for (char v : vowel) {
            if (c == v) {
                return true;
            }
        }

        return false;
    }
}
