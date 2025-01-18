import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        StringBuilder sb = new StringBuilder();

        while (!(input = br.readLine()).equals(".")) {
            Deque<Character> stack = new ArrayDeque<>();
            boolean isBalanced = true;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isBalanced = false;
                        break;
                    } 
                    stack.pop();  
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                }
            }
            
            if (isBalanced && stack.isEmpty()) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }
        }

        System.out.println(sb.toString());
    }
}