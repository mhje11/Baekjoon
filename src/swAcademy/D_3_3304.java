package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_3304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            int l1 = s1.length();
            int l2 = s2.length();

            int[][] dp = new int[l1 + 1][l2 + 1];

            for (int j = 1; j <= l1; j++) {
                for (int k = 1; k <= l2; k++) {
                    if (s1.charAt(j - 1) == s2.charAt(k - 1)) {
                        dp[j][k] = dp[j - 1][k - 1] + 1;
                    } else {
                        dp[j][k] = Math.max(dp[j - 1][k], dp[j][k - 1]);
                    }
                }
            }

            sb.append("#").append(i).append(" ").append(dp[l1][l2]).append('\n');
        }
        System.out.println(sb);
    }
}
