package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_3_2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] score = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }
        //dp[i][j] 현재까지 j개의 계단을 연속해서 밟고 i번째 계단까지 올라섰을 때
        //점수 합의 최댓값, 단 i번째 계단은 반드시 밟아야함

        int[][] dp = new int[n + 1][3];
        //점화식
        //dp[k][1] = Math.max(dp[k-2][1], dp[k-2][2]) + score[k]
        //dp[k][2] = dp[k-1][1] + score[k]

        dp[1][1] = score[1];


        if (n > 1) {
            dp[2][1] = score[2];
            dp[2][2] = score[1] + score[2];
        }

        for (int i = 3; i <= n; i++) {
            dp[i][1] = Math.max(dp[i - 2][1], dp[i - 2][2]) + score[i];
            dp[i][2] = dp[i - 1][1] + score[i];
        }

        int result = Math.max(dp[n][1], dp[n][2]);
        System.out.println(result);

    }
}
