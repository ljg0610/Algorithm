import java.util.*;

public class Main {
    static final int FINAL_NUM = 10000;

    public static void main(String[] args) {
        boolean[] isSelfNumber = new boolean[FINAL_NUM + 1];

        for (int i = 1; i <= FINAL_NUM; i++) {
            int n = i;
            int selfNum = getSelfNumber(n);
            if (selfNum <= FINAL_NUM) {
                isSelfNumber[selfNum] = true;
            }
        }

        for (int i = 1; i <= FINAL_NUM; i++) {
            if (!isSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }

    static int getSelfNumber(int num) {
        int sum = num;
        while (num > 0) {
            sum += num % 10; 
            num /= 10; 
        }
        return sum;
    }
}
