package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_3_1003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] dp0 = new int[41];
        int[] dp1 = new int[41];
        dp0[0] = 1;
        dp1[0] = 0;
        dp0[1] = 0;
        dp1[1] = 1;
        for (int i = 2; i <= 40; i++) {
            dp0[i] = dp0[i - 2] + dp0[i - 1];
            dp1[i] = dp1[i - 2] + dp1[i - 1];
        }

        while (t-- > 0) {
            int num = Integer.parseInt(br.readLine());
            sb.append(dp0[num]).append(" ").append(dp1[num]).append('\n');
        }

        System.out.println(sb);
    }

}
