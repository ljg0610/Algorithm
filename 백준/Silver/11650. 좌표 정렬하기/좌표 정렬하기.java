import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] input = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            input[i][0] = Integer.parseInt(line[0]);
            input[i][1] = Integer.parseInt(line[1]);
        }

        coordSort(input);
    }

    static void coordSort(int[][] input){
        Arrays.sort(input, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b){
                if(a[0] == b[0]){
                    return Integer.compare(a[1], b[1]);
                }else{
                    return Integer.compare(a[0], b[0]);
                }
            }
        });

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i][0] + " " + input[i][1]);
        }
    }
}
