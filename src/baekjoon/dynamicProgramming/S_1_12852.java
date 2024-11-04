package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S_1_12852 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] dp = new int[x + 1];
        int[] path = new int[x + 1];

        dp[1] = 0;

        for (int i = 2; i <= x; i++) {
            dp[i] = dp[i - 1] + 1;
            path[i] = i - 1;
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
                if (dp[i] == dp[i / 2] + 1) {
                    path[i] = i / 2;
                }
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
                if (dp[i] == dp[i / 3] + 1) {
                    path[i] = i / 3;
                }
            }
        }
        System.out.println(dp[x]);

        List<Integer> result = new ArrayList<>();
        int current = x;

        while (current!= 0) {
            result.add(current);
            current = path[current];
        }
        for (Integer i : result) {
            System.out.print(i + " ");
        }
    }
}
