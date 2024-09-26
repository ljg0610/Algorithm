import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.next().toLowerCase();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    static boolean isGroupWord(String word) {
        HashSet<Character> seen = new HashSet<>();
        char prevChar = '\0'; // 이전 문자 초기화

        for (char currentChar : word.toCharArray()) {
            // 이전 문자와 다르고, 현재 문자가 이미 본 문자일 경우 그룹 단어 아님
            if (currentChar != prevChar) {
                if (seen.contains(currentChar)) {
                    return false; // 그룹 단어가 아님
                }
                seen.add(currentChar); // 현재 문자 추가
            }
            prevChar = currentChar; // 이전 문자 업데이트
        }

        return true; // 그룹 단어
    }
}
