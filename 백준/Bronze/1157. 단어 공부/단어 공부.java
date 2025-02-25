import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();
        int[] countArr = new int[26];

        for (char ch : input.toCharArray()) {
            countArr[ch - 'A']++;
        }

        int maxCount = 0;
        char maxChar = ' ';
        boolean isDuplicate = false;
        
        for (int i = 0; i < 26; i++) {
            if (countArr[i] > maxCount) {
                maxCount  = countArr[i];
                maxChar = (char) (i + 'A');
                isDuplicate = false;
            } else if (countArr[i] == maxCount) {
                isDuplicate = true;
            }
        }

        System.out.println(isDuplicate ? '?' : maxChar);
    }
}