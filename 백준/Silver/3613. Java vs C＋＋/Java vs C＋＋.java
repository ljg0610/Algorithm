import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        if (input.contains("_")) {
            if (input.startsWith("_") || input.endsWith("_") || input.contains("__") || input.matches(".*[A-Z].*")) {
                System.out.println("Error!");
                return;
            }
            String[] cProg = input.split("_");
            sb.append(cProg[0]);

            for (int i = 1; i < cProg.length; i++) {
                sb.append(Character.toUpperCase(cProg[i].charAt(0))).append(cProg[i].substring(1));
            }
        } else if (Character.isLowerCase(input.charAt(0)) && input.matches("^[a-zA-Z]+$")) {
            for (char c : input.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    sb.append('_').append(Character.toLowerCase(c));
                } else {
                    sb.append(c);
                }
            }
        } else {
            sb.append("Error!");
        }

        System.out.println(sb);
    }
}