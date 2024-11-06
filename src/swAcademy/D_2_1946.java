package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class D_2_1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            int stringCount = 0;
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new TreeMap<>();
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String alphabet = st.nextToken();
                int count = Integer.parseInt(st.nextToken());
                map.put(alphabet, count);
            }

            sb.append("#").append(i).append('\n');

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String key = entry.getKey();
                int value = entry.getValue();
                for (int j = 0; j < value; j++) {
                    if (stringCount != 0 && stringCount % 10 == 0) {
                        sb.append('\n').append(key);
                    }else {
                        sb.append(key);
                    }
                    stringCount++;
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
