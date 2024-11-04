package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class G_3_4179 {
    static int R, C;
    static char[][] map;
    static int[][] fireTime;
    static int[][] jihunTime;
    static Queue<int[]> jihunQueue = new LinkedList<>();
    static Queue<int[]> fireQueue = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        fireTime = new int[R][C];
        jihunTime = new int[R][C];

        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = s.charAt(j);
                if (map[i][j] == 'J') {
                    jihunQueue.offer(new int[]{i, j});
                    jihunTime[i][j] = 0;
                } else if (map[i][j] == 'F') {
                    fireQueue.offer(new int[]{i, j});
                    fireTime[i][j] = 0;
                } else {
                    fireTime[i][j] = Integer.MAX_VALUE;
                    jihunTime[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        bfsFire();

        int escapeTime = bfsJihun();
        if (escapeTime == -1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(escapeTime);
        }
    }

    public static void bfsFire() {
        while (!fireQueue.isEmpty()) {
            int[] current = fireQueue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= R || ny < 0 || ny >= C) {
                    continue;
                }
                if (map[nx][ny] == '.' && fireTime[nx][ny] == Integer.MAX_VALUE) {
                    fireTime[nx][ny] = fireTime[x][y] + 1;
                    fireQueue.offer(new int[]{nx, ny});
                }
            }
        }
    }

    public static int bfsJihun() {
        while (!jihunQueue.isEmpty()) {
            int[] current = jihunQueue.poll();
            int x = current[0];
            int y = current[1];

            if (x == 0 || x == R - 1 || y == 0 || y == C - 1) {
                return jihunTime[x][y] + 1;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= R || ny < 0 || ny >= C) {
                    continue;
                }
                if (map[nx][ny] == '.' && jihunTime[nx][ny] == Integer.MAX_VALUE) {
                    if (jihunTime[x][y] + 1 < fireTime[nx][ny]) {
                        jihunTime[nx][ny] = jihunTime[x][y] + 1;
                        jihunQueue.offer(new int[]{nx, ny});
                    }
                }
            }
        }
        return -1;
    }
}
