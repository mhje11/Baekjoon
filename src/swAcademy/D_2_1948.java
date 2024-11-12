package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_2_1948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int month1 = Integer.parseInt(st.nextToken());
            int day1 = Integer.parseInt(st.nextToken());
            int month2 = Integer.parseInt(st.nextToken());
            int day2 = Integer.parseInt(st.nextToken());

            int a = days[month1] - day1;
            int b = 0;
            if (month1 != month2) {
                for (int j = month1 + 1; j < month2; j++) {
                    b += days[j];
                }
                int date = a + b + day2 + 1;
                sb.append("#").append(i).append(" ").append(date).append('\n');
            } else {
                int date = day2 - day1 + 1;
                sb.append("#").append(i).append(" ").append(date).append('\n');
            }

        }
        System.out.println(sb);
    }
}
