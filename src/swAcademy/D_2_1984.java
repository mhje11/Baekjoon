package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class D_2_1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list);
            int sum = 0;
            for (int j = 1; j < list.size() - 1; j++) {
                sum += list.get(j);
            }


            int average = Math.round(sum / 8.0f);
            sb.append("#").append(i).append(" ").append(average).append('\n');
        }
        System.out.println(sb);
    }
}
