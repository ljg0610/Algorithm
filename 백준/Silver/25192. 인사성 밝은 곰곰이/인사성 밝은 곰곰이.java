import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        final String ENTER = "ENTER";
        
        Map<String, Integer> chatMap = new HashMap<>();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            String name = br.readLine();
            
            if (name.equals(ENTER)) {
                sum += chatMap.size();
                chatMap = new HashMap<>();
                continue;
            } else {
                chatMap.put(name, chatMap.getOrDefault(name, 0) + 1);
                if (i == n - 1) {
                    sum += chatMap.size();
                }
            }
        }

        System.out.println(sum);
    }
}