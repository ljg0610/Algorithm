import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        
        Set<String> set = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length() - i; j++) {
                set.add(input.substring(j, j + i + 1));
            }
        }

        System.out.println(set.size());
    }
}