import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < n ; i++) {
            String input = br.readLine();
            if (input.length() >= m) {
                wordMap.put(input, wordMap.getOrDefault(input, 0) + 1);
            }
        }

        List<String> wordList = new ArrayList<>(wordMap.keySet());

        wordList.sort((a,b) -> {
            if (!wordMap.get(a).equals(wordMap.get(b))) return wordMap.get(b) - wordMap.get(a);
            if (a.length() != b.length()) return b.length() - a.length();
            return a.compareTo(b);
        });

        StringBuilder sb = new StringBuilder();

        for (String word : wordList) {
            sb.append(word).append('\n');
        }

        System.out.println(sb);
    }
}