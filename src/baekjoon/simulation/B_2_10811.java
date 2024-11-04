package baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        for (int l = 0; l < M; l++) {
            st = new StringTokenizer(br. readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            reverse(arr, i, j);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start - 1];
            arr[start - 1] = arr[end - 1];
            arr[end - 1] = temp;
            start++;
            end--;
        }
    }

}
