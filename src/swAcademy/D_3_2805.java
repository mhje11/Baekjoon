package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_3_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= 10; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];


            for (int j = 0; j < n; j++) {
                String s = br.readLine();
                for (int k = 0; k < n; k++) {
                    int num = s.charAt(k) - '0';
                    arr[j][k] = num;
                }
            }

            int sum = 0;
            int half = n / 2;

            for (int j = 0; j < n; j++) {
                int start = Math.abs(half - j);
                int end = n - Math.abs(half - j);
                for (int k = start; k < end; k++) {
                    sum += arr[j][k];
                }
            }
            System.out.println("#" + i + " " + sum);
        }
    }
}
