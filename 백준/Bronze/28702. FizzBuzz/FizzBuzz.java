import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 3; i >= 1; i--) {
            String str = br.readLine();
            char c = str.charAt(0);

            if (c != 'F' && c != 'B') {
                int result = Integer.parseInt(str) + i;

                if (result % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else if (result % 3 == 0) {
                    System.out.println("Fizz");
                } else if (result % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(result);
                }
                break;
            }
        }
    }
}
