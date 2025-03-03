import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        List<String> list = new ArrayList<>();

        for (int i = 1; i < input.length() - 1; i++) {
            for (int j = i + 1; j < input.length(); j++) {
                StringBuilder sb1 = new StringBuilder(input.substring(0, i));
                StringBuilder sb2 = new StringBuilder(input.substring(i, j));
                StringBuilder sb3 = new StringBuilder(input.substring(j));
                StringBuilder sb = new StringBuilder();
                sb.append(sb1.reverse()).append(sb2.reverse()).append(sb3.reverse());
                list.add(sb.toString());
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
