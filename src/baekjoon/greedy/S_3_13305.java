package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_3_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] length = new int[n - 1];
        int[] cost = new int[n];
        long totalCost = 0;
        for (int i = 0; i < length.length; i++) {
            length[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        long minCost = cost[0];

        for (int i = 0; i < n - 1; i++) {
            if (cost[i] < minCost) {
                minCost = cost[i];
            }

            totalCost += minCost * length[i];
        }

        System.out.println(totalCost);

    }
}
