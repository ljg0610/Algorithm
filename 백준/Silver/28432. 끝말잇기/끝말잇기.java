import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());
       String[] inputs = new String[n];
       int idx = 0;

       for (int i = 0; i < n; i++) {
            inputs[i] = br.readLine();
            if (inputs[i].equals("?")) {
                idx = i;
            }
       }

       Character start = null;
       Character end = null;

       if (idx > 0) {
           start = inputs[idx - 1].charAt(inputs[idx-1].length() - 1);
       }

       if (idx + 1 < n) {
            end = inputs[idx + 1].charAt(0);
       }

       int m = Integer.parseInt(br.readLine());

       for (int i = 0; i < m; i++) {
            String input = br.readLine();

            boolean flag = true;

            if (start != null && !input.startsWith(start.toString())) {
                flag = false;
            }

            if (end != null && !input.endsWith(end.toString())) {
                flag = false;
            }

            for (int j = 0; j < n; j++) {
                if (inputs[j].equals(input)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(input);
                return;
            }
       }
    }
}