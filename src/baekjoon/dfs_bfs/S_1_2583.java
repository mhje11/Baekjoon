package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S_1_2583 {
    static int M;
    static int N;
    static int K;
    static int[][] arr;
    static boolean[][] isVisit;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[M][N];
        isVisit = new boolean[M][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    arr[k][j] = 1;
                }
            }
        }


        List<Integer> areaSizes = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 0 && !isVisit[i][j]) {
                    count = 0;
                    bfs(i, j);
                    areaSizes.add(count);
                }
            }
        }
        Collections.sort(areaSizes);
        System.out.println(areaSizes.size());
        for (Integer size : areaSizes) {
            System.out.print(size + " ");
        }


    }

    public static void bfs(int x, int y) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        isVisit[x][y] = true;
        count++;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (nx < 0 || nx >= M || ny < 0 || ny >= N || isVisit[nx][ny] || arr[nx][ny] == 1) {
                    continue;
                }
                queue.offer(new int[]{nx, ny});
                count++;
                isVisit[nx][ny] = true;
            }
        }
    }
}
