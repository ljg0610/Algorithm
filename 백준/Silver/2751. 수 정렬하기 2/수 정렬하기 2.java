import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> setNum = new HashSet<>();

        for (int i = 0; i < n; i++) {
            setNum.add(Integer.parseInt(br.readLine()));
        }

        TreeSet<Integer> sTreeSet = new TreeSet<>(setNum);

        StringBuilder sb = new StringBuilder();
        for(Integer result : sTreeSet){
            sb.append(result).append("\n");
        }

        System.out.print(sb.toString().trim());
    }
}