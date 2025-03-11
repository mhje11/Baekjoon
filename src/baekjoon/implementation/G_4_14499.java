package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G_4_14499 {
    public static int N;
    public static int M;
    public static int x;
    public static int y;
    public static int K;
    public static int[][] arr;
    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {1, -1, 0, 0};
    public static int[] dice = {0, 0, 0, 0, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < K; i++) {
            int dir = Integer.parseInt(st.nextToken()) - 1;
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                continue;
            }

            x = nx;
            y = ny;

            rollDice(dir);

            if (arr[x][y] == 0) {
                arr[x][y] = dice[1];
            } else {
                dice[1] = arr[x][y];
                arr[x][y] = 0;
            }

            System.out.println(dice[0]);
        }


    }

    public static void rollDice(int dir) {
        int temp;
        if (dir == 0) {
            temp = dice[0];
            dice[0] = dice[3];
            dice[3] = dice[1];
            dice[1] = dice[2];
            dice[2] = temp;
        } else if (dir == 1) {
            temp = dice[0];
            dice[0] = dice[2];
            dice[2] = dice[1];
            dice[1] = dice[3];
            dice[3] = temp;
        } else if (dir == 2) {
            temp = dice[0];
            dice[0] = dice[5];
            dice[5] = dice[1];
            dice[1] = dice[4];
            dice[4] = temp;
        } else {
            temp = dice[0];
            dice[0] = dice[4];
            dice[4] = dice[1];
            dice[1] = dice[5];
            dice[5] = temp;
        }
    }
}
