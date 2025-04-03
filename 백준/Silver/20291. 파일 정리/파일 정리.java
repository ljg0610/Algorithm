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

        for (Map.Entry<String, Integer> entry : files.entrySet()) {
            sb.append(entry.getKey()).append(' ').append(entry.getValue()).append('\n');
        }

        System.out.println(sb);
    }
}