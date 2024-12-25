import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input;

            while (true) {
                input = br.readLine();
                if(input.equals("0")) {
                    return;
                }
                String reverse = new StringBuilder(input).reverse().toString();

                if(reverse.equals(input)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
