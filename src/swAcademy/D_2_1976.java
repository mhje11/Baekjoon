package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_2_1976 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int hr1 = Integer.parseInt(st.nextToken());
            int min1 = Integer.parseInt(st.nextToken());
            int hr2 = Integer.parseInt(st.nextToken());
            int min2 = Integer.parseInt(st.nextToken());

            int hour = hr1 + hr2;
            int minute = min1 + min2;

            if (minute >= 60) {
                hour += minute / 60;
                minute %= 60;
            }
            hour %= 12;
            if (hour == 0) {
                hour = 12;
            }
            sb.append("#").append(i).append(" ").append(hour).append(" ").append(minute).append('\n');
        }
        System.out.println(sb);
    }
}
