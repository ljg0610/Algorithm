import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        String word = br.readLine();

        int originLength = input.length();
        input = input.replace(word, "");

        int result = (originLength - input.length()) / word.length();

        System.out.println(result);
    }
}
