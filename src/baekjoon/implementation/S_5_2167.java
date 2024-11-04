package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//baekjoon.implementation

public class S_5_2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
    for (int i = 0; i < N; i++) {
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int k = 0; k < M; k++){
            arr[i][k] = Integer.parseInt(st1.nextToken());
        }
    }
    int K = Integer.parseInt(br.readLine());
    int[] result = new int[K];
    int[] sum = new int[K];
    for (int k = 0; k < K; k++) {
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int i = Integer.parseInt(st1.nextToken()) - 1;
        int j = Integer.parseInt(st1.nextToken()) - 1;
        int x = Integer.parseInt(st1.nextToken()) - 1;
        int y = Integer.parseInt(st1.nextToken()) - 1;
        for (int row = i; row <= x; row ++) {
            for (int col = j; col <= y; col++) {
                sum[k] += arr[row][col];
            }
        }

    }
        for (int j : sum) {
            System.out.println(j);
        }
    }
}
