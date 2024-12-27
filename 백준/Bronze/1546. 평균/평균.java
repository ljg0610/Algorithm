import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] scores = new double[n];
        double max = 0.0;
        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            if(max < scores[i]) {
                max = scores[i];
            }
        }
        
        double num = 0.0;

        for (int i = 0; i < scores.length; i++) {
            num += (scores[i] / max) * 100;
        }

        double avg = num / n;

        System.out.println(avg);
    }
}
