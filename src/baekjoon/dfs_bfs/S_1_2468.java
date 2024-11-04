package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S_1_2468 {
    static int N;
    static int[][] arr;
    static boolean[][] isVisit;
    static int maxHeight;
    static int maxCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        maxHeight = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] > maxHeight) {
                    maxHeight = arr[i][j];
                }
            }
        }

        while (maxHeight-- > 0) {
            isVisit = new boolean[N][N];
            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!isVisit[i][j] && arr[i][j] > maxHeight) {
                        bfs(i, j, maxHeight);
                        count++;
                    }
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(maxCount);
    }

    public static void bfs(int x, int y, int maxHeight) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= N || isVisit[nx][ny] || arr[nx][ny] <= maxHeight) {
                    continue;
                }

                queue.offer(new int[]{nx, ny});
                isVisit[nx][ny] = true;
            }


        }
    }
}
