package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class G_3_2206 {
    static int N;
    static int M;
    static int[][] arr;
    static int[][][] distance;
    static boolean[][][] isVisit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        isVisit = new boolean[N][M][2];
        distance = new int[N][M][2];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        int result = bfs(0, 0);
        System.out.println(result);
    }

    public static int bfs(int x, int y) {
        //북, 남, 동, 서
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y, 0});
        isVisit[x][y][0] = true;
        distance[x][y][0] = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            int broken = current[2];

            if (cx == N - 1 && cy == M - 1) {
                return distance[cx][cy][broken];
            }

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (arr[nx][ny] == 0 && !isVisit[nx][ny][broken]) {
                        isVisit[nx][ny][broken] = true;
                        distance[nx][ny][broken] = distance[cx][cy][broken] + 1;
                        queue.offer(new int[]{nx, ny , broken});
                    }
                    if (arr[nx][ny] == 1 && broken == 0 && !isVisit[nx][ny][1]) {
                        isVisit[nx][ny][1] = true;
                        distance[nx][ny][1] = distance[cx][cy][broken] + 1;
                        queue.offer(new int[]{nx, ny, 1});
                    }
                }
            }
        }
        return -1;
    }
}
