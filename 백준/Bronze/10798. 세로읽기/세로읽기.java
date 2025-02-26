import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Character[][] words = new Character[5][15];
        int maxLen = 0;

        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            int inputLen = input.length();

            if (maxLen < inputLen) {
                maxLen = inputLen;
            }

            for (int j = 0; j < inputLen; j++) {
                words[i][j] = input.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < maxLen; i++) {
            for (int j = 0; j < 5; j++) {
                if(words[j][i] != null) {
                    sb.append(words[j][i]);
                }
            }
        }

        System.out.println(sb.toString());
    }
}