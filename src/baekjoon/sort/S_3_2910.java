package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S_3_2910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new LinkedHashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() != o2.getValue()) {
                    return o2.getValue() - o1.getValue();
                } else {
                    return 0;
                }
            }
        });

        for (Map.Entry<Integer, Integer> entry : list) {
            int value = entry.getValue();
            int key = entry.getKey();
            for (int i = 0; i < value; i++) {
                System.out.print(key + " ");
            }
        }
    }
}
