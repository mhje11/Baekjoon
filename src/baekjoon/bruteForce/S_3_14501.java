package baekjoon.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_3_14501 {
    //fail
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n + 1];
        int[] p = new int[n + 1];
        int max = 0;

        for (int i = 1; i < n + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < n + 1; i++) {
            int money = 0;

            for (int j = i; j <= n; j++) {
                if (j + t[j] - 1 <= n) {
                    money += p[j];
                    j += t[j] - 1;
                }
            }

            if (money > max) {
                max = money;
            }
        }
        System.out.println(max);

    }
}
