class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            int row = arr1[i] | arr2[i];
            String bin = String.format("%" + n + "s", 
                                       Integer.toBinaryString(row)).replace(' ', '0');
            answer[i] = bin.replace('1', '#').replace('0', ' ');
        }
        return answer;
    }
}