import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int quiz = 8;
        final int top = 5;
        
        int[] scores = new int[quiz];
        for (int i = 0; i < quiz; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        int[] sortScores = scores.clone();
        Arrays.sort(sortScores);
        List<Integer> topScores = new ArrayList<>();

        int total = 0;
        for (int i = quiz - 1; i >= quiz - top; i--) {
            topScores.add((Integer)sortScores[i]); 
            total += sortScores[i];
        }

        Arrays.sort(sortScores);
        bw.write(total + "\n");
        
        for (int i = 0; i < scores.length; i++) {
            if(topScores.contains(scores[i])) {
                bw.write((i+1) + " ");
            }
        }
        bw.write("\n");
        br.close();
        bw.close();
    }
}
