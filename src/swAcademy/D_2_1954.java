package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_2_1954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];
            // 우 하 좌 상
            int[] dx = {0, 1, 0, -1};
            int[] dy = {1, 0, -1, 0};
            int x = 0;
            int y = 0;
            int direction = 0;
            int num = 1;
            while (num <= n * n) {
                arr[x][y] = num++;
                int nx = x + dx[direction];
                int ny = y + dy[direction];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                } else {
                    direction = (direction + 1) % 4;
                    x += dx[direction];
                    y += dy[direction];
                }
            }
            sb.append("#").append(i).append('\n');
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    sb.append(arr[j][k]).append(" ");
                }
                sb.append('\n');
            }

        }
        System.out.println(sb);
    }
}
