import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] input = br.readLine().split(" ");
        String month = input[0];
        int day = Integer.parseInt(input[1].replace(",", ""));
        int year = Integer.parseInt(input[2]);
        String[] time = input[3].split(":");
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);

        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        if (isLeap) {
            daysPerMonth[1] = 29;
        }
        int totalMinute = isLeap ? 366 * 24 * 60 : 365 * 24 * 60;

        int monthIdx = 0;
        for (int i = 0; i < 12; i++) {
            if (monthName[i].equals(month)) {
                monthIdx = i;
                break;
            }
        }

        int sumMinute = 0;
        for (int i = 0; i < monthIdx; i++) {
            sumMinute += daysPerMonth[i] * 24 * 60;
        }

        sumMinute += (day - 1) * 24 * 60 + (hour * 60) + minute;

        double percent = sumMinute * 100.0 / totalMinute;
        System.out.printf("%.9f\n", percent);


    }
}