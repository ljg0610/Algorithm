import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        poliomino(input);
    } 

    private static void poliomino(String input) {
        final String A = "AAAA";
        final String B = "BB";

        input = input.replaceAll("XXXX", A);
        input = input.replaceAll("XX", B);

        if(input.contains("X")) {
            System.out.println("-1");
        } else {
            System.out.println(input);
        }
    }
}
