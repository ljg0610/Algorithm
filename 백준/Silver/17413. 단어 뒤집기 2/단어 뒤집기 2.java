import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] input = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            if (input[i] == '<') {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(input[i]);
                while (true) {
                    if (input[++i] == '>') {
                        sb.append(input[i]);
                        break;
                    }
                    sb.append(input[i]);
                }
            } else if (input[i] == ' ') {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(' ');
            } else {
                stack.push(input[i]);
            }
        }

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}