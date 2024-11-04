package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S_1_2178 {
    static int N;
    static int M;
    static int[][] arr;
    static boolean[][] isVisited;
    static int[][] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        isVisited = new boolean[N][M];
        distance = new int[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        bfs(0, 0);
        System.out.println(distance[N -1][M - 1]);

    }

    public static void bfs(int x, int y) {
        //이동방향 상 하 좌 우
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        isVisited[x][y] = true;
        distance[x][y] = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                //범위 체크 : x가 0이상 N 보다 작아야함
                if (nx < 0) {
                    continue;
                }
                if (nx >= N) {
                    continue;
                }

                //범위체크 : y가 0 이상이고 M보다 작아야함
                if (ny < 0) {
                    continue;
                }
                if (ny >= M) {
                    continue;
                }

                //방문 여부 체크
                if (isVisited[nx][ny]) {
                    continue; //방문했으면 다음 반복으로
                }
                //이동 가능 여부 체크
                if (arr[nx][ny] == 0) {
                    continue; //0 이면 이동 못하니까 다음 반복으로
                }

                //모든 조건을 통과한 경우
                //큐에 추가
                queue.offer(new int[]{nx, ny});

                //방문 체크
                isVisited[nx][ny] = true;

                //거리 업데이트
                distance[nx][ny] = distance[current[0]][current[1]] + 1;
            }

        }
    }
}
