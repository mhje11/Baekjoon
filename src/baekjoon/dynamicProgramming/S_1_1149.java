package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1_1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] rgb = new int[n + 1][4];
        int[][] dp = new int[n + 1][4];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 3; j++) {
                rgb[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[1][1] = rgb[1][1];
        dp[1][2] = rgb[1][2];
        dp[1][3] = rgb[1][3];

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 1) {
                    dp[i][j] = Math.min(dp[i - 1][2], dp[i - 1][3]) + rgb[i][1];
                }
                if (j == 2) {
                    dp[i][j] = Math.min(dp[i - 1][1], dp[i - 1][3]) + rgb[i][2];
                }
                if (j == 3) {
                    dp[i][j] = Math.min(dp[i - 1][1], dp[i - 1][2]) + rgb[i][3];
                }
            }
        }
        int min = Math.min(dp[n][1], dp[n][2]);
        min = Math.min(min, dp[n][3]);
        System.out.println(min);

    }
}
