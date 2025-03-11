package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1_2775_V2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[][] dp = new int[k + 1][n + 1];

            for (int i = 1; i <= n; i++) {
                dp[0][i] = i;
            }

            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= n; j++) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
            System.out.println(dp[k][n]);
        }

    }
}
