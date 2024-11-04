package baekjoon.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_3_15659_V2 {
    static int N;
    static int M;
    static boolean[] isVisit;
    static int[] result;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        isVisit = new boolean[N + 1];
        arr = new int[N + 1];
        result = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }
        backtracking(0);
    }

    public static void backtracking(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!isVisit[i]) {
                isVisit[i] = true;
                result[depth] = arr[i];
                backtracking(depth + 1);
                isVisit[i] = false;
            }
        }

    }
}
