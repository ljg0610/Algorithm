import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        String[][] days = new String[13][32];
        LinkedList<String> weeks = new LinkedList<>(Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"));

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j < 32; j++) {
                days[i][j] = weeks.getFirst();
                String day = weeks.poll();
                weeks.addLast(day);
                if (i == 2 && j == 28) {
                    break;
                } else if ((i == 4 || i == 6 || i == 9 || i == 11) && j ==30) {
                    break;
                }
            }
        }

        System.out.println(days[x][y]);
    }
}
