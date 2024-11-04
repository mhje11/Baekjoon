package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_3_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int later = Integer.parseInt(br.readLine());

        hour += later / 60;
        minute += later % 60;

        if (minute >= 60) {
            minute -= 60;
            hour += 1;
        }

        if (hour >= 24) {
            hour %= 24;
        }


        System.out.println(hour + " " + minute);

    }
}
