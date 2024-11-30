package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class D_3_1208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());


            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < 100; j++) {
                int num = Integer.parseInt(st.nextToken());
                list.add(num);
            }

            for (int j = 0; j < n; j++) {
                int max = Collections.max(list);
                int min = Collections.min(list);
                if (max - min <= 1) {
                    break;
                }

                list.set(list.indexOf(max), max - 1);
                list.set(list.indexOf(min), min + 1);
            }
            int finalMax = Collections.max(list);
            int finalMin = Collections.min(list);
            int result = finalMax - finalMin;
            sb.append("#").append(i).append(" ").append(result).append('\n');
        }
        System.out.println(sb);
    }
}
