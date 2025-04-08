import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        boolean isJava = false;
        boolean isCpp = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '_') isCpp = true;
            if (Character.isUpperCase(c)) isJava = true;
        }

        if ((isJava && isCpp) 
                || input.startsWith("_") 
                || input.endsWith("_") 
                || input.contains("__") 
                || Character.isUpperCase(input.charAt(0))) {
            System.out.println("Error!");
            return;
        }

        if (isCpp) {
            boolean toUpper = false;
            for (char c : input.toCharArray()) {
                if (c == '_') {
                    toUpper = true;
                } else {
                    sb.append(toUpper ? Character.toUpperCase(c) : c);
                    toUpper = false;
                }
            }
        } else {
            for (char c : input.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    sb.append('_').append(Character.toLowerCase(c));
                } else {
                    sb.append(c);
                }
            }
        }

        System.out.println(sb);
    }
}