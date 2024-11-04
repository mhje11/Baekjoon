package baekjoon.hashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S_5_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if (st.nextToken().equals("enter")) {
                map.put(s, "o");
            } else {
                map.remove(s);
            }
        }

        map.keySet().stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .forEach(System.out::println);
    }
}
