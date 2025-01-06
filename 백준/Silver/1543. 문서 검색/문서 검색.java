import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        String word = br.readLine();

        int result = 0;
        int i = 0;

        int inputLength = input.length();
        int wordLength = word.length();

        while (i <= inputLength - wordLength) {
            if (input.substring(i, i + wordLength).equals(word)) {
                result++;
                i += wordLength;
            } else {
                i++;
            }
        }

        System.out.println(result);
    }
}
