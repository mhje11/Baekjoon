package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_3_9561 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n <= 3) {
                sb.append("1").append('\n');
                continue;
            }
            long[] dp = new long[n + 1];
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            for (int i = 4; i <= n; i++) {
                dp[i] = dp[i - 2] + dp[i - 3];
            }
            sb.append(dp[n]).append('\n');
        }
        System.out.println(sb);
    }
}
