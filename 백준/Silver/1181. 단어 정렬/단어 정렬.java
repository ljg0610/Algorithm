import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> arrList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String now = br.readLine();
            if(!arrList.contains(now)){
                arrList.add(now);
            }            
        }
        Collections.sort(arrList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
    }
}