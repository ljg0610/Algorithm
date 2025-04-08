import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= t; tc++) {
            int[][] arr = new int[9][9];
            sb.append("#" + tc).append(' ');
            boolean flag = true;

            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }


            // 가로
            for (int i = 0; i < 9; i++) {
                int[] nums = arr[i];
                if (!isValid(nums)) {
                    flag = false;
                    break;
                }
            }

            //세로 체크
            if (flag) {
                for (int j = 0; j < 9; j++) {
                    int[] nums = new int[9];
                    for (int i = 0; i < 9; i++) {
                        nums[i] = arr[i][j];
                    }
                    if (!isValid(nums)) {
                        flag = false;
                        break;
                    }
                }
            }
            
            // 3x3 체크
            if (flag) {
                for (int i = 0; i < 9; i += 3) {
                    for (int j = 0; j < 9; j += 3) {
                        int[] nums = new int[9];
                        int idx = 0;
                        for (int r = 0; r < 3; r++) {
                            for (int c = 0; c < 3; c++) {
                                nums[idx++] = arr[i + r][j + c];
                            }
                        }
                        if (!isValid(nums)) {
                            flag = false;
                            break;
                        }
                    }
                }
            }

            if (flag) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }

        System.out.println(sb);
    }

    private static boolean isValid(int[] nums) {
        boolean[] checks = new boolean[10];
        for (int num : nums) {
            if (num < 1 || num > 9 || checks[num]) {
                return false;
            }
            checks[num] = true;
        }

        return true;
    }
}