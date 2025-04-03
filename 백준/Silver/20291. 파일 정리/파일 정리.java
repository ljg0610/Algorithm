import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> files = new TreeMap<>();
        
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("\\.");
            String extension = input[1];
            files.put(extension, files.getOrDefault(extension, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (String key : files.keySet()) {
            sb.append(key).append(' ').append(files.get(key)).append('\n');
        }

        System.out.println(sb);
    }
}