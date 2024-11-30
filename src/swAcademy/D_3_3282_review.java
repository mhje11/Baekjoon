package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_3282_review {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int[] dp = new int[v + 1];
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int volume = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());

                for (int k = v; k >= volume; k--) {
                    dp[k] = Math.max(dp[k], dp[k - volume] + cost);
                }
            }
            sb.append("#").append(i).append(" ").append(dp[v]).append('\n');
        }
        System.out.println(sb);
    }
}
