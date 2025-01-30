import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static final int NUMS = 20;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> booksMap = new HashMap<>();
        List<String> bookName = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            if (!bookName.contains(name)) {
                bookName.add(name);    
            }
            
            booksMap.put(name, booksMap.getOrDefault(name, 0) + 1);    
        }
        
        Collections.sort(bookName);

        int max = Integer.MIN_VALUE;
        String result = "";
        for (int i = 0; i < bookName.size(); i++) {
            int current = booksMap.get(bookName.get(i));
            if (max < current) {
                max = current;
                result = bookName.get(i);
            }
        }

        System.out.println(result);
    }
}