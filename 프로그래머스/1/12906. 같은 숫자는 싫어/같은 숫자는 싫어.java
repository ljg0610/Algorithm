import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        stack.addLast(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                stack.addLast(arr[i]);
            }
        }
        
        int[] answer = new int[stack.size()];
        
        int idx = 0;  
        for(int num : stack) {
            answer[idx++] = num;
        }
        
        return answer;
    }
}