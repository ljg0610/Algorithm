import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
          
        System.out.println(calc(a, b, c));
    }

    public static long calc(int a, int b, int c){
        if(b == 0){
            return 1;
        }
        long result = calc(a, b / 2, c);
        if(b % 2 == 0){
            return result * result % c;
        }else{
            return (result * result % c) * a % c;
        }
    }
}
