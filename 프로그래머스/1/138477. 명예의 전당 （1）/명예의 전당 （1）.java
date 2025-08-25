import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int m = Math.min(k, score.length);
        int[] nums = new int[m];
        
        nums[0] = score[0];
        answer[0] = nums[0];
        for (int i = 1 ; i < m; i++) {
            nums[i] = score[i];
            Arrays.sort(nums, 0, i + 1);
            answer[i] = nums[0];
        }
        
        
        for (int i = m; i < score.length; i++) {
            if (nums[0] < score[i]) {
                nums[0] = score[i];
                Arrays.sort(nums);  
            } 
            answer[i] = nums[0];
        }
        
        return answer;
    }
}