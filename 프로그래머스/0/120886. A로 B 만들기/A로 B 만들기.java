import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");
        List<String> beforeList = new ArrayList<>();
        List<String> afterList = new ArrayList<>();

        for(int i = 0; i < before.length(); i++){
            beforeList.add(beforeArr[i]);
            afterList.add(afterArr[i]);
        }

        Collections.sort(beforeList);
        Collections.sort(afterList);
        
        if(beforeList.equals(afterList)){
            return 1;
        }
        
        return 0;
    }
}