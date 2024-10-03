package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S_4_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        Map<Integer, String> s = new HashMap<>();

        for (int i = 0; i < n; i++) {
            s.put(i, br.readLine());
        }
        for (int i = 0; i < m; i++) {
            if (s.containsValue(br.readLine())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
