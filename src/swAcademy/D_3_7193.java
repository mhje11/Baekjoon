package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_7193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String x = st.nextToken();
            int sum = 0;
            for (int j = 0; j < x.length(); j++) {
                sum += x.charAt(j) -'0';
                sum %= (n - 1);
            }
            sb.append("#").append(i).append(" ").append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
