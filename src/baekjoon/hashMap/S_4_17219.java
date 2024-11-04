package baekjoon.hashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S_4_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> key = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            key.put(st.nextToken(), st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            System.out.println(key.get(br.readLine()));
        }
    }
}
