package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class D_3_13038 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            int minDays = Integer.MAX_VALUE;

            for (int j = 0; j < 7; j++) {
                int rest = n;
                int days = 0;
                for (int k = 0; rest > 0; k++) {
                    int currentDay = list.get((j + k) % 7);
                    if (currentDay == 1) {
                        rest--;
                    }
                    days++;
                }
                minDays = Math.min(minDays, days);
            }

            sb.append("#").append(i).append(" ").append(minDays).append('\n');
        }
        System.out.println(sb);
    }
}
