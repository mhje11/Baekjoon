package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_4_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int[] dp = new int[k + 1];
        for (int i = 1; i <= k; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int coin : coins) {
            for (int j = coin; j <= k; j++) {
                if (dp[j - coin] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - coin] + 1);
                }
            }
        }
        System.out.println(dp[k] == Integer.MAX_VALUE ? -1 : dp[k]);
    }
}
