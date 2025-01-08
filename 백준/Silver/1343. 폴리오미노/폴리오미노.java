import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputs = input.split("\\.");
        br.close();

        poliomino(input, inputs);
    } 

    private static void poliomino(String input ,String[] inputs) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        final String A = "AAAA";
        final String B = "BB";

        for (int i = 0; i < inputs.length; i++) {
            int value = inputs[i].length();

            if (value % 2 != 0) {
                System.out.println(-1);
                return;
            } else if (value % 4 == 0) {
                sb.append(A.repeat(value / 4));
            } else {
                sb.append(A.repeat(value / 4));
                sb.append(B);
            }

            if (i != inputs.length - 1) {
                sb.append(".");
            }
        }

        if(input.length() - sb.toString().length() != 0) {
            sb.append(".".repeat(input.length() - sb.toString().length()));
        }
        
        bw.write(sb + "\n");
        bw.flush();
        bw.close();
    }
}
