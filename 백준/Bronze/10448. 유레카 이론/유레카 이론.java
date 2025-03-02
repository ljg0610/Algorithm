import java.io.*;

public class Main {
    static int[] T;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        T = new int[45];

        for (int i = 1; i < 45; i++) {
            T[i] = (i * (i + 1)) / 2;
        }

        for (int i = 0; i < testCase; i++) {
            int input = Integer.parseInt(br.readLine());
            int result = eureka(input);
            System.out.println(result);
        }
    }

    private static int eureka(int input) {
        for (int i = 1; i < 45; i++) {
            for (int j = 1; j < 45; j++) {
                for (int k = 1; k < 45; k++) {
                    if (input == T[i] + T[j] + T[k]) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
