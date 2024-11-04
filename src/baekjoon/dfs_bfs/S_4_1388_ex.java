package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_4_1388_ex {
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
                    dfs(i, j);
                }
            }
        }
        System.out.println(count);

    }

    public static void dfs(int x, int y) {
        isVisited[x][y] = true;

        if (arr[x][y] == '-') {
            if (y == M - 1) {
                count++;
                return;
            }
        }

        int nextY = y + 1;

        if (arr[x][nextY] == '-' && !isVisited[x][nextY]) {
            dfs(x, nextY);
        }
        else {
            count++;
            return;
        }

    }
}
