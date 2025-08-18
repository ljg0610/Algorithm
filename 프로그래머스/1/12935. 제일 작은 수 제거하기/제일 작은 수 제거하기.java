import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[] {-1};
        
        int[] nums = arr.clone();
        Arrays.sort(nums);
        int num = nums[0];
        
        int[] answer = new int[arr.length - 1];
        int idx = 0;
        
        for (int n : arr) {
            if (n == num) {
                continue;
            }
            answer[idx++] = n;
        }
        
        return answer;
    }
}