class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int idx = 0;
        for (String[] pic : photo) {
            for (int i = 0; i < pic.length; i++) {
                for (int j = 0; j < name.length; j++) {
                    if (pic[i].equals(name[j])) {
                        answer[idx] += yearning[j];
                    }
                }
            }
            idx++;
        }
        
        return answer;
    }
}