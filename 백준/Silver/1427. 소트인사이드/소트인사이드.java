import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        descendSort(num);
    }

    static void descendSort(int num){        
        List<Integer> inputList = new ArrayList<>();
        while (num > 0) {
            inputList.add(num%10);
            num /= 10;
        }

        Collections.sort(inputList);
        Collections.reverse(inputList);

        for (Integer result : inputList) {
            System.out.print(result);
        }
    }
}
