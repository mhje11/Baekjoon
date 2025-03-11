package baekjoon.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1_14889 {
    static int N;
    static int[][] stat;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        stat = new int[N][N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                stat[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        backtracking(0, 0);
        System.out.println(min);
    }

    public static void backtracking(int start, int depth) {
        if (depth == N / 2) {
            calculateDiff();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                backtracking(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }

    public static void calculateDiff() {
        int teamStart = 0;
        int teamLink = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i] && visited[j]) {
                    teamStart += stat[i][j];
                } else if (!visited[i] && !visited[j]) {
                    teamLink += stat[i][j];
                }
            }
        }
        min = Math.min(min, Math.abs(teamStart - teamLink));
    }
}
