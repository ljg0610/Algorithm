import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static class Olympic implements Comparable<Olympic>{
        int index;
        int gold;
        int silver;
        int bronze;
        int rank;

        Olympic(int index, int gold, int silver, int bronze) {
            this.index = index;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
            this.rank = 0;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        @Override
        public int compareTo(Olympic other) {
            if (this.gold != other.gold) {
                return other.gold - this.gold;
            } else if (this.silver != other.silver) {
                return other.silver - this.silver;
            } else {
                return other.bronze - this.bronze;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Olympic> olympics = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
                int index = Integer.parseInt(st.nextToken());
                int gold = Integer.parseInt(st.nextToken());
                int silver = Integer.parseInt(st.nextToken());
                int bronze = Integer.parseInt(st.nextToken());

                olympics.add(new Olympic(index, gold, silver, bronze));
        }
        br.close();

        Collections.sort(olympics);

        int currentRank = 1;
        olympics.get(0).setRank(currentRank);

        for (int i = 1; i < olympics.size(); i++) {
            Olympic prev = olympics.get(i - 1);
            Olympic current = olympics.get(i);

            if(current.gold == prev.gold && current.silver == prev.silver && current.bronze == prev.bronze) {
                current.setRank(currentRank);
            } else {
                currentRank = i + 1;
                current.setRank(currentRank);
            }
        }

        for (Olympic olympic : olympics) {
            if(olympic.index == k) {
                System.out.println(olympic.rank);
                return;
            }
        }
    }
}
