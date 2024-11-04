package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S_2_4963 {
    static int w;
    static int h;
    static int[][] arr;
    static boolean[][] isVisit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0) {
                break;
            }
            arr = new int[h][w];
            isVisit = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!isVisit[i][j] && arr[i][j] == 1) {
                        bfs(i, j);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    public static void bfs(int x, int y) {
        int[] dx = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = new int[]{1, 0, -1, -1, 1, 1, 0, -1};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        isVisit[x][y] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (nx < 0 || nx >= h || ny < 0 || ny >= w || isVisit[nx][ny] || arr[nx][ny] == 0) {
                    continue;
                }

                queue.offer(new int[]{nx, ny});
                isVisit[nx][ny] = true;
             }
        }
    }
}
