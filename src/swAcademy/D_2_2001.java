package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_2_2001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] arr = new int[n][n];
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < n; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            int result = fly(arr, m);
            sb.append("#").append(i).append(" ").append(result).append('\n');

        }
        System.out.println(sb);
    }

    public static int fly(int[][] arr, int m) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - m; i++) {
            for (int j = 0; j <= arr.length - m; j++) {

                int current = 0;
                for (int k = 0; k < m; k++) {
                    for (int l = 0; l < m; l++) {
                        current += arr[k + i][j + l];
                    }
                }
                max = Math.max(max, current);
            }
        }
        return max;
    }
}
