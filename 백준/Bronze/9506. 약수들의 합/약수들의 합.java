import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input;
        StringBuilder sb = new StringBuilder();

        while ((input = Integer.parseInt(br.readLine())) != -1) {
            List<Integer> list = new ArrayList<>(Arrays.asList(1));
            int total = 1;
            for (int i = 2; i < input; i++) {
                if (input % i == 0) {
                    list.add(i);
                    total += i;
                }
            }

            if (total == input) {
                sb.append(input).append(" = ");
                for (int i = 0; i <list.size() - 1; i++) {
                    sb.append(list.get(i)).append(" + ");
                }
                sb.append(list.get(list.size() - 1)).append('\n');
            } else {
                sb.append(input).append(" is NOT perfect.").append('\n');
            }
        }

        System.out.println(sb);
    }
}
