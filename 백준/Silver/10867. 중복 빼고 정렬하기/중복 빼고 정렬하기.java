import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        HashSet<Integer> inpuSet = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            inpuSet.add(Integer.parseInt(st.nextToken()));
        }

        TreeSet<Integer> resultSet = new TreeSet<>(inpuSet);

        StringBuilder sb = new StringBuilder();

        for(Integer num : resultSet){
            sb.append(num).append(" ");
        }

        System.out.print(sb.toString().trim());
    }
}