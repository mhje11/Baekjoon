package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_3_1913 {
    //상 우 하 좌
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        int currentX = n / 2;
        int currentY = n / 2;
        int count = 1;
        int currentRot = 0;

        int ansX = 0;
        int ansY = 0;

        arr[currentX][currentY] = count;
        if (count == num) {
            ansX = currentX + 1;
            ansY = currentY + 1;
        }

        int step = 1;

        while (count < n * n) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < step; j++) {
                    currentX += dx[currentRot];
                    currentY += dy[currentRot];
                    if (currentX < 0 || currentX >= n || currentY < 0 || currentY >= n) {
                        break;
                    }

                    count++;
                    arr[currentX][currentY] = count;

                    if (count == num) {
                        ansX = currentX + 1;
                        ansY = currentY + 1;
                    }

                    if (count == n * n) {
                        break;
                    }
                }
                currentRot = (currentRot + 1) % 4;
            }
            step++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                sb.append('\n');
            }
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]).append(" ");
            }
        }

        sb.append('\n').append(ansX).append(" ").append(ansY);
        System.out.println(sb);
    }
}
