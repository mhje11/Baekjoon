package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class G_5_7576 {
    static int N;
    static int M;
    static int days = 0;
    static Queue<int[]> queue = new LinkedList<>();
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    queue.offer(new int[] {i, j});
                }
            }
        }
        bfs();

        if (hasUnripeTomatoes()) {
            System.out.println(-1);
        } else {
            System.out.println(days - 1);
        }

    }

    public static void bfs() {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = current[0] + dx[j];
                    int ny = current[1] + dy[j];

                    if (nx >= 0 && nx < N && ny >= 0 && ny < M && arr[nx][ny] == 0) {
                        arr[nx][ny] = 1;
                        queue.offer(new int[] {nx, ny});
                    }
                }
            }
            days++;
        }
    }

    public static boolean hasUnripeTomatoes() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
