import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Character> stack = new ArrayDeque<>();

        char[] input = br.readLine().toCharArray();

        int cnt = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == '(') {
                stack.push(input[i]);
            } else if (input[i] == ')' && !stack.isEmpty()) {
                stack.pop();
                cnt += 2;
            }
        }

        System.out.println(input.length - cnt);
    }
}