package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_2_2005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] pascal = new int[n][];
            pascal[0] = new int[1];
            pascal[0][0] = 1;
            for (int j = 1; j < n; j++) {
                pascal[j] = new int[j + 1];
                for (int k = 0; k <= j; k++) {
                    if (k == 0 || k == j) {
                        pascal[j][k] = 1;
                    }else {
                        pascal[j][k] = pascal[j - 1][k - 1] + pascal[j - 1][k];
                    }
                }
            }
            sb.append("#").append(i).append('\n');
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < pascal[j].length; k++) {
                    sb.append(pascal[j][k]).append(" ");
                }
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }
}
