package baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class G_5_14503 {
    static int N;
    static int M;
    static int[][] arr;
    static boolean[][] isVisit;
    static int r;
    static int c;
    static int d;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        isVisit = new boolean[N][M];

        st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        clean();
        System.out.println(count);


    }

    // 0 북, 1 동, 2 남, 3 서
    public static void clean() {
        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, 1, 0, -1};

        while (true) {
            if (!isVisit[r][c]) {
                isVisit[r][c] = true;
                count++;
            }
            boolean cleaned = false;

            for (int i = 0; i < 4; i++) {
                d = (d + 3) % 4;
                int nx = r + dx[d];
                int ny = c + dy[d];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M && !isVisit[nx][ny] && arr[nx][ny] == 0) {
                    r = nx;
                    c = ny;
                    cleaned = true;
                    break;
                }
            }

            if (!cleaned) {
                int backDir = (d + 2) % 4;
                int bx = r + dx[backDir];
                int by = c + dy[backDir];

                if (bx >= 0 && bx < N && by >= 0 && by < M && arr[bx][by] == 0) {
                    r = bx;
                    c = by;
                } else {
                    break;
                }
            }
        }
    }
}
