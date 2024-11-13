import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> inpuSet = new HashSet<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            if(state.equals("enter")){
                inpuSet.add(name);
            } else if(state.equals("leave")) {
                inpuSet.remove(name);
            }
        }

        List<String> result = new ArrayList<>(inpuSet);
        Collections.sort(result, Collections.reverseOrder());

        for(String name : result) {
            System.out.println(name);
        }
    }
}
