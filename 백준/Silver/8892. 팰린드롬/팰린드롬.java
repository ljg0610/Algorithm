import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            String[] words = new String[k];
            
            for (int j = 0; j < k; j++) {
                words[j] = br.readLine();
            }

            boolean flag = true;

            for (int a = 0; a < k; a++) {
                String left = words[a];
                for (int b = 0; b < k; b++) {
                    if (b == a) {
                        continue;
                    }
                    String right = words[b];
                    String word = left + right;
                    int len = word.length() / 2;

                    if (flag == false) {
                        continue;
                    }

                    if (word.length() % 2 == 0) {
                        StringBuffer sBuffer = new StringBuffer(word.substring(len));
                        String reverse = sBuffer.reverse().toString();
                        if (word.substring(0, len).equals(reverse)) {
                            sb.append(word).append('\n');
                            flag = false;
                        }
                    } else {
                        StringBuffer sBuffer = new StringBuffer(word.substring(len + 1));
                        String reverse = sBuffer.reverse().toString();
                        if (word.substring(0, len).equals(reverse)) {
                            sb.append(word).append('\n');
                            flag = false;
                        }
                    }
                }

                if (flag == false) {
                    continue;
                }
            }

            if (flag) {
                sb.append(0).append('\n');
            }
        }

        System.out.println(sb);
    }
}