import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        final String DEFAULT_NUM = "666";
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int cnt = 0;
        int result = 666;

        while(true){
            if(String.valueOf(result).contains(DEFAULT_NUM)){
                cnt++;
            }

            if(cnt == n){
                System.out.println(result);
                break;
            }
            result++;
        }
    }
}