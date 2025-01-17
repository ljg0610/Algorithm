import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        final String ADD = "add";
        final String REMOVE = "remove";
        final String CHECK = "check";
        final String TOGGLE = "toggle";
        final String ALL = "all";
        final String EMPTY = "empty";
        final int SIZE = 20;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (input.startsWith(ADD)) {
                set.add(Integer.parseInt(input.substring(ADD.length() + 1)));
            } else if (input.startsWith(REMOVE)) {
                int x = Integer.parseInt(input.substring(REMOVE.length() + 1));
                if (set.contains(x)) {
                    set.remove(x);   
                }
            } else if (input.startsWith(CHECK)) {
                int x = Integer.parseInt(input.substring(CHECK.length() + 1));
                sb.append(set.contains(x) ? 1 : 0).append('\n');
            } else if (input.startsWith(TOGGLE)) {
                int x = Integer.parseInt(input.substring(TOGGLE.length() + 1));
                if (set.contains(x)) {
                    set.remove(x);
                } else {
                    set.add(x);
                }
            } else if (input.equals(ALL)) {
                for (int j = 1; j <= SIZE; j++) {
                    set.add(j);
                }
            } else if (input.equals(EMPTY)) {
                set.removeAll(set);
            }
        }

        System.out.println(sb.toString());
    }
}