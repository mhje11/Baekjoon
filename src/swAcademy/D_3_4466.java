package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D_3_4466 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] score = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                score[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(score);
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += score[score.length - j - 1];
            }

            sb.append("#").append(i).append(" ").append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
