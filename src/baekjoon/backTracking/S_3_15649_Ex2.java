package baekjoon.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_3_15649_Ex2 {
    static int N;
    static int M;
    static boolean[] isUsed;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        isUsed = new boolean[N + 1];
        arr = new int[M];
        backtracking(0);
    }

    public static void backtracking(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!isUsed[i]) {
                isUsed[i] = true;
                arr[depth] = i;
                backtracking(depth + 1);
                isUsed[i] = false;
            }
        }
    }
}
