package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_2_1959 {
    static int N;
    static int M;
    static int[] arrA;
    static int[] arrB;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arrA = new int[N];
            arrB = new int[M];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arrA[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arrB[j] = Integer.parseInt(st.nextToken());
            }
            sb.append("#").append(i).append(" ").append(max()).append('\n');
        }
        System.out.println(sb);
    }

    public static int max() {

        int max = Integer.MIN_VALUE;
        if (N <= M) {
            for (int i = 0; i <= M - N; i++) {
                int current = 0;
                for (int j = 0; j < arrA.length; j++) {
                    current += arrA[j] * arrB[j + i];
                }
                max = Math.max(max, current);
            }
        } else {
            for (int i = 0; i <= N - M; i++) {
                int current = 0;
                for (int j = 0; j < M; j++) {
                    current += arrA[j + i] * arrB[j];
                }
                max = Math.max(max, current);
            }
        }

        return max;
    }
}
