package baekjoon.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_3_15650 {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        isVisited = new boolean[N + 1];

        backtracking(1, 0);
    }

    public static void backtracking(int start, int depth) {
        if(depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                arr[depth] = i;
                backtracking(i + 1,depth + 1);
                isVisited[i] = false;
            }
        }
    }
}
