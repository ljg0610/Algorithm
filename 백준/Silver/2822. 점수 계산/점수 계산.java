import java.io.*;
import java.util.*;

public class Main {
    
    // 점수와 해당 인덱스를 저장할 클래스 정의
    static class Score implements Comparable<Score> {
        int value;
        int index;
        
        Score(int value, int index) {
            this.value = value;
            this.index = index;
        }
        
        // 내림차순 정렬을 위해 compareTo 메서드 오버라이드
        @Override
        public int compareTo(Score other) {
            return other.value - this.value;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int quiz = 8;
        final int top = 5;
        
        // 점수와 인덱스를 저장할 리스트
        List<Score> scoreList = new ArrayList<>();
        
        // 점수 입력 받기
        for (int i = 1; i <= quiz; i++) {
            int score = Integer.parseInt(br.readLine());
            scoreList.add(new Score(score, i)); // 인덱스는 1부터 시작
        }
        br.close();
        
        // 점수를 기준으로 내림차순 정렬
        Collections.sort(scoreList);
        
        // 상위 5개의 점수 선택
        List<Score> topScores = scoreList.subList(0, top);
        
        // 상위 5개 점수의 합 계산
        int total = 0;
        for (Score s : topScores) {
            total += s.value;
        }
        
        // 선택된 상위 5개의 인덱스 추출
        List<Integer> indices = new ArrayList<>();
        for (Score s : topScores) {
            indices.add(s.index);
        }
        
        // 인덱스를 오름차순으로 정렬
        Collections.sort(indices);
        
        // 결과 출력
        bw.write(total + "\n");
        for (int i = 0; i < indices.size(); i++) {
            bw.write(indices.get(i) + (i < indices.size() - 1 ? " " : "\n"));
        }
        bw.flush();
        bw.close();
    }
}
