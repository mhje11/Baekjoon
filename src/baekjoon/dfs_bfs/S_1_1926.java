package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S_1_1926 {
    static int n;
    static int m;
    static boolean[][] isVisited;
    static int count = 0;
    static int max = 0;
    static int[][] paper;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        isVisited = new boolean[n][m];
        paper = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(paper[i][j] == 1 && !isVisited[i][j]) {
                    count++;
                    max = Math.max(max, bfs(i, j));
                }
            }
        }
        System.out.println(count);
        System.out.println(max);


    }

    public static int bfs(int x, int y) {
        //상 하 좌 우
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        isVisited[x][y] = true;
        int area = 0;
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            area++;

            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m ||
                        isVisited[nx][ny] || paper[nx][ny] == 0) {
                    continue;
                }
                queue.offer(new int[]{nx, ny});
                isVisited[nx][ny] = true;
            }
        }
        return area;
    }
}
