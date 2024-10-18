import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        long result = 0;
        long num = 0;
        int cnt = 0;
        while(true){
            result += ++num; 
            if(result > s){
                break;
            }
            cnt++;
        }

        System.out.print(cnt);
    }
}