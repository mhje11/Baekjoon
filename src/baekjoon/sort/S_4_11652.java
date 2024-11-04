package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class S_4_11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        Map<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = Integer.MIN_VALUE;
        long result = 0;

        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            Long key = entry.getKey();
            Integer value = entry.getValue();

            if (value > maxCount || (value == maxCount && key < result)) {
                result = key;
                maxCount = value;
            }
        }
        System.out.println(result);
    }
}
