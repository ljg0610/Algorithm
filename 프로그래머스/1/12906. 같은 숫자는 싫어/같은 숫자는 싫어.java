import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int tmp = arr[0];
        int idx = 0;
        list.add(arr[0]);
        
        for (int num : arr) {
            if (tmp != num) {
                list.add(num);
                tmp = num;
                idx++;
            }
            tmp = num;
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}