import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static int n;
    static int[] nums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        Arrays.sort(nums);

        StringBuilder sb = new StringBuilder();
        sb.append(mean()).append('\n');
        sb.append(median()).append('\n');
        sb.append(mode()).append('\n');
        sb.append(range()).append('\n');

        System.out.println(sb.toString());
    }

    private static int mean() {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        return (int)Math.round(sum / n);
    }

    private static int median() {
        return nums[n / 2];
    }

    private static int mode() {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int num : nums) {
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        for (int cnt : numsMap.values()) {
            if (max < cnt) {
                max = cnt;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);

        return list.size() == 1 ? list.get(0) : list.get(1);
    }

    private static int range() {
        return nums[n - 1] - nums[0];
    }
    
}