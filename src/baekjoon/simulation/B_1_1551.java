package baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1_1551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), ",");
        int[] arr = new int[N];
        int[] arrB = new int[N - 1];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if (K == 0) {
            for (int i = 0; i < N; i++) {
                if (i == arr.length - 1) {
                    sb.append(arr[i]);
                } else
                sb.append(arr[i]).append(",");
            }
            System.out.println(sb);

        } else {
            for (int i = 0; i < K; i++) {
                arrB = new int[arr.length - 1];
                for (int j = 0; j < arrB.length; j++) {
                    arrB[j] = arr[j + 1] - arr[j];
                }
                arr = Arrays.copyOf(arrB, arrB.length);
            }

            for (int i = 0; i < arrB.length; i++) {
                if (i == arrB.length - 1) {
                    sb.append(arr[i]);
                } else {
                    sb.append(arr[i]).append(",");
                }
            }
            System.out.println(sb);

        }
    }
}
