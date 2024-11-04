package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S_1_7562 {
    static int T;
    static int L;
    static boolean[][] isVisit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            L = Integer.parseInt(br.readLine());
            isVisit = new boolean[L][L];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int currentX = Integer.parseInt(st.nextToken());
            int currentY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int targetX = Integer.parseInt(st.nextToken());
            int targetY = Integer.parseInt(st.nextToken());

            int moves = bfs(currentX, currentY, targetX, targetY);
            sb.append(moves).append('\n');
        }
        System.out.println(sb);
    }

    public static int bfs(int x, int y, int targetX, int targetY) {
        int[] dx = new int[]{-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = new int[]{-1, 1, -2, 2, -2, 2, - 1, 1};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y, 0});

        isVisit[x][y] = true;
        while (!queue.isEmpty()) {

            int[] current = queue.poll();
            int moves = current[2];
            if (current[0] == targetX && current[1] == targetY) {
                return moves;
            }
            for (int i = 0; i < 8; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (nx < 0 || nx >= L || ny < 0 || ny >= L || isVisit[nx][ny]) {
                    continue;
                }

                queue.offer(new int[]{nx, ny, moves + 1});
                isVisit[nx][ny] = true;
            }
        }
        return -1;
    }
}
