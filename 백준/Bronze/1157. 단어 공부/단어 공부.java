import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine().toUpperCase();

        Map<Character, Integer> strMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            strMap.put(ch, strMap.getOrDefault(ch, 0) + 1);
        }

        int maxValue = Integer.MIN_VALUE;
        char maxKey = ' ';

        for (Map.Entry<Character, Integer> entry : strMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            } else if (entry.getValue() == maxValue) {
                maxKey = '?';
            }
        }
        
        System.out.println(maxKey);
    }
}