package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class G_5_10026 {
    static int N;
    static char[][] grid;
    static boolean[][] normalVisit;
    static boolean[][] abnormalVisit;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        grid = new char[N][N];
        normalVisit = new boolean[N][N];
        abnormalVisit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        int abnormalCount = 0;
        int normalCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!normalVisit[i][j]) {
                    bfs(i , j ,true);
                    normalCount++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!abnormalVisit[i][j]) {
                    bfs(i ,j, false);
                    abnormalCount++;
                }
            }
        }
        System.out.println(normalCount + " " + abnormalCount);
    }


    public static void bfs(int x, int y, boolean isNormal) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});

        if (isNormal) {
            normalVisit[x][y] = true;
        } else {
            abnormalVisit[x][y] = true;
        }
        char color = grid[x][y];

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
                    continue;
                }
                if (isNormal) {
                    if (!normalVisit[nx][ny] && grid[nx][ny] == color) {
                        normalVisit[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
                } else {
                    if (!abnormalVisit[nx][ny] && isSameColor(color, grid[nx][ny])) {
                        abnormalVisit[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
                }

            }
        }
    }

    public static boolean isSameColor(char color1, char color2) {
        if ((color1 == 'R' || color1 == 'G') && (color2 == 'R' || color2 == 'G')) {
            return true;
        }
        return color1 == color2;
    }
}
