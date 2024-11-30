package baekjoon.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G_5_15686 {
    static int N;
    static int M;
    static int[][] arr;
    static int min = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static int[][] copyArr(int[][] arr) {
        int[][] copy = new int[N][];
        for (int i = 0; i < N; i++) {
            copy[i] = arr[i].clone();
        }
        return copy;
    }

    public static void backtracking(int count) {
        if (count == M) {
//            Math.min(min, calculateMin());
        }


    }

    public static int calculateMin(int[][] arr) {
        int current = 0;
        return Math.min(current, min);
    }
}
