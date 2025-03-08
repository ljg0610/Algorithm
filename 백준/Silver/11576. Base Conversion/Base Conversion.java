import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int ten = 0;

        for (int i = m - 1; i >= 0; i--) {
            ten += (int) (Integer.parseInt(st.nextToken()) * (Math.pow(a, i)));
        }

        
        Stack<Integer> stack = new Stack<>();

        if (ten == 0) {
            System.out.println(0);
            return;
        }

        while (ten > 0) {
            stack.push(ten % b);
            ten /= b;
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()) {
            sb.append(stack.pop()).append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}