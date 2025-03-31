import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        StringBuilder sb = new StringBuilder();

        while ((input = br.readLine()) != null) {
            sb.append(input);
        }

        int[] alphabet = new int[26];
        int max = 0;
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a']++;

                if (alphabet[c - 'a'] > max) {
                    max = alphabet[c - 'a'];
                }
            }   
        }

        StringBuilder words = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (max == alphabet[i]) {
                words.append((char) (i + 'a'));
            }
        }

        System.out.println(words);
    }
}