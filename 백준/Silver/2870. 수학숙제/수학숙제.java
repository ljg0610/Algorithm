import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        List<BigInteger> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);

                if (Character.isDigit(c)) {
                    sb.append(c);
                } else if (sb.length() > 0) {
                    nums.add(new BigInteger(sb.toString()));
                    sb.setLength(0);
                }
            }

            if (sb.length() > 0) {
                nums.add(new BigInteger(sb.toString()));
            }
        }

        Collections.sort(nums);

        for (BigInteger b : nums) {
            System.out.println(b);
        }
    }
}