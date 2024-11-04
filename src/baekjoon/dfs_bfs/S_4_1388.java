package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_4_1388 {
    static int N;
    static int M;
    static char[][] arr;
    static boolean[][] isVisited;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new char[N][M];
        isVisited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!isVisited[i][j]) {
                    if (arr[i][j] == '-') {
                        dfsHorizontal(i, j);  // 가로 방향 탐색
                    } else if (arr[i][j] == '|') {
                        dfsVertical(i, j);  // 세로 방향 탐색
                    }
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void dfsHorizontal(int x, int y) {
        isVisited[x][y] = true;

        // 가로 방향으로 같은 '-' 구간을 탐색
        int nextY = y + 1;

        if (nextY < M && arr[x][nextY] == '-' && !isVisited[x][nextY]) {
            dfsHorizontal(x, nextY);
        }
    }

    public static void dfsVertical(int x, int y) {
        isVisited[x][y] = true;

        // 세로 방향으로 같은 '|' 구간을 탐색
        int nextX = x + 1;

        if (nextX < N && arr[nextX][y] == '|' && !isVisited[nextX][y]) {
            dfsVertical(nextX, y);
        }
    }
}
