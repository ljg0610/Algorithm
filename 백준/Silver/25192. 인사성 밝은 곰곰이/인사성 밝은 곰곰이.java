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
                chatMap.clear();
            } else {
                if (!chatMap.containsKey(name)) {
                    sum++;
                    chatMap.put(name, 1);
                }
            }
        }

        System.out.println(sum);
    }
}