package baekjoon.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1_2775 {
    public static int[][] apt = new int[15][15];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        make_Apt();
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(apt[k][n]).append('\n');
        }
        System.out.println(sb.toString().trim());
    }

    public static void make_Apt() {
        for (int i = 0; i < 15; i++) {
            apt[i][1] = 1;
            apt[0][i] = i;
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }
    }
}
