import java.util.*;
public class Main{
    static int x = 1;
    static int y = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fractionSearch(num);
        System.out.println(x + "/" + y);
    }

    static void fractionSearch(int num){
        int cnt = 1;
        int dir = -1;
    
        while(num > cnt){
            if(x == 1 && dir == -1){
                y++;
                dir = 1;
            }else if(y == 1 && dir == 1){
                x++;
                dir = -1;
            }else if(dir == 1){
                y--;
                x++;
            }else{
                x--;
                y++;
            }
            cnt++;
        }
    }
}
