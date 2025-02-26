import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] words = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                words[i][j] = input.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words[0].length; i++) {
            for (int j = 0; j < 5; j++) {
                if(words[j][i] != '\0') {
                    sb.append(words[j][i]);
                }
            }
        }

        System.out.println(sb.toString());
    }
}