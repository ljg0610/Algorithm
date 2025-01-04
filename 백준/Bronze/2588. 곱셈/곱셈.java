import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());

        String[] secondVal = String.valueOf(second).split("");
        
        int[] values = new int[3];
        for (int i = secondVal.length - 1; i >= 0; i--) {
            values[i] = first * Integer.parseInt(secondVal[i]);
            System.out.println(values[i]); 
        }

        int pos = 0;
        final int nums = 10;
        int sum = 0;
  
        for (int i = secondVal.length - 1; i >= 0; i--) {
            sum += values[i] * Math.pow(nums, pos++);
        }

        System.out.println(sum);
    }
}
