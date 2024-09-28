import java.util.*;

public class Main{
    static final int finalNum = 10000;
    public static void main(String[] args) {
        ArrayList<Integer> result = selfNumber(finalNum);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }

    static ArrayList<Integer> selfNumber(int num){
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> selfNumList = new ArrayList<>();

        int[] numArr;
        
        for(int i = 1; i <= num; i++){
            int answer = i;
            String[] numString = ("" + i).split("");
            numArr = new int[numString.length];
            for(int j = 0; j < numArr.length; j++){
                answer += Integer.parseInt(numString[j]);
            }
            if(answer <= finalNum){
                numList.add(answer);
            }
        }

        for(int i = 1; i < num; i++){
            if(!numList.contains(i)){
                selfNumList.add(i);
            }
        }

        return selfNumList;
    }
}