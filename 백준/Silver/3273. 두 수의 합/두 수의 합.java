import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        System.out.println(searchSum(arr, x));
    }

    private static int searchSum(int[] arr, int x) {
        int cnt = 0;
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            if (arr[left] + arr[right] == x) {
                cnt++;
                left++;
                right--;
            } else if (arr[left] + arr[right] > x) {
                right--;
            } else {
                left++;
            }
        }

        return cnt;
    }
}