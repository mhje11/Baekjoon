package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S_1_2667 {
    static int N;
    static int[][] arr;
    static boolean[][] isVisit;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        isVisit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1 && !isVisit[i][j]) {
                    list.add(bfs(i, j));
                    count++;
                }
            }
        }
        Collections.sort(list);
        System.out.println(count);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static int bfs(int x, int y) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{x, y});
        isVisit[x][y] = true;
        int home = 1;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= N || isVisit[nx][ny] || arr[nx][ny] == 0) {
                    continue;
                }

                queue.offer(new int[]{nx, ny});
                isVisit[nx][ny] = true;
                home++;
            }
        }
        return home;
    }
}
