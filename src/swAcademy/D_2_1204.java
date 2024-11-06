package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class D_2_1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            Integer.parseInt(br.readLine());
            Map<Integer, Integer> map = new HashMap<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 1000; j++) {
                int num = Integer.parseInt(st.nextToken());
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int maxKey = Integer.MIN_VALUE;
            int maxValue = Integer.MIN_VALUE;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                if (value >= maxValue) {
                    if (value == maxValue) {
                        if (key > maxKey) {
                            maxKey = key;
                        }
                    }
                    maxValue = value;
                    maxKey = key;
                }
            }
            sb.append("#").append(i).append(" ").append(maxKey).append('\n');
        }
        System.out.println(sb);
    }
}
