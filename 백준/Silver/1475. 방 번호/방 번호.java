import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] cnt = new int[10];
        int result = 0;

        for(char c : s.toCharArray()){
            int num = c - '0';
            cnt[num]++;
        }

        int sumSixAndNine = cnt[6] + cnt[9];

        cnt[6] = sumSixAndNine / 2 + sumSixAndNine % 2;
        cnt[9] = 0;

        for(int i = 0; i < 9; i++){
            result = Math.max(result, cnt[i]);
        }

        System.out.print(result);
    }
}