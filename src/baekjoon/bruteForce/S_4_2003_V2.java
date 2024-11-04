package baekjoon.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_4_2003_V2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] total = new int[n];
        int sum = 0;
        int count = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());
            total[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            if (total[i] == m) {
                count++;
            }
            for (int j = i + 1; j < n; j++) {
                if (total[j] - total[i] == m) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}