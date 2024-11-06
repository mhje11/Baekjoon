package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class D_2_1285 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            Map<Integer, Integer> map = new HashMap<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int distance = Integer.parseInt(st.nextToken());
                map.put(distance, map.getOrDefault(distance, 0) + 1);
            }

            int min = Integer.MAX_VALUE;
            for (Integer distance : map.keySet()) {
                if (min > Math.abs(distance - 0)) {
                    min = Math.abs(distance - 0);
                }
            }
            int sum = map.getOrDefault(min, 0) + map.getOrDefault(-1 * min, 0);
            sb.append("#").append(i).append(" ")
                    .append(min).append(" ").append(sum).append('\n');

        }
        System.out.println(sb);
    }
}
