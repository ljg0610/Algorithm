import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
    
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            if(!list.contains(input)){
                list.add(input);
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (Integer result : list) {
            sb.append(result).append(" ");
        }

        System.out.print(sb.toString().trim());
    }
}