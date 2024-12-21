import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        int heru = 0;
        int auset = 0;
        int ausar = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());

            heru = Integer.parseInt(st.nextToken());
            auset = Integer.parseInt(st.nextToken());
            ausar = Integer.parseInt(st.nextToken());

            if(heru == 0 && auset == 0 && ausar == 0) {
                break;
            }

            if((heru * heru + auset * auset) == ausar * ausar) {
                System.out.println("right");
            } else if((auset * auset + ausar * ausar) == heru * heru) {
                System.out.println("right");
            } else if((ausar * ausar + heru * heru) == auset * auset) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
