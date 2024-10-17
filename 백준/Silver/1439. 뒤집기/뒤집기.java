import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] zeroArr = new String[s.length()];
        String[] oneArr = new String[s.length()];

        zeroArr = s.split("0");
        oneArr = s.split("1");

        int cntZero = 0;
        int cntOne = 0;

        for (int i = 0; i < zeroArr.length; i++) {
            if(!zeroArr[i].equals("")){
                cntZero++;
            }
        }

        for (int i = 0; i < oneArr.length; i++) {
            if(!oneArr[i].equals("")){
                cntOne++;
            }
        }

        int result = cntZero > cntOne ? cntOne : cntZero;

        System.out.print(result);
    }
}