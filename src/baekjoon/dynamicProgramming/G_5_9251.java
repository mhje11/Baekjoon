package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G_5_9251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s2 = br.readLine();
        int[][] dp = new int[s.length() + 1][s2.length() + 1];

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (max < dp[i][j]) {
                    max = dp[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
