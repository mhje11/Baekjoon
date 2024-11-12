package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_1209 {
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            Integer.parseInt(br.readLine());
            arr = new int[100][100];
            for (int j = 0; j < 100; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < 100; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            int max = max();
            sb.append("#").append(i).append(" ").append(max).append('\n');
        }
        System.out.println(sb);
    }

    public static int max() {
        //가로
        int width = 0;
        int height = 0;
        int diagonalRight = 0;
        int diagonalLeft = 0;
        for (int i = 0; i < 100; i++) {
            int current = 0;
            for (int j = 0; j < 100; j++) {
                current += arr[i][j];
            }
            width = Math.max(width, current);
        }

        //세로
        for (int i = 0; i < 100; i++) {
            int current = 0;
            for (int j = 0; j < 100; j++) {
                current += arr[j][i];
            }
            height = Math.max(current, height);
        }

        //대각선 (오른쪽)
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (i == j) {
                    diagonalRight += arr[i][j];
                }
            }
        }
        //대각선 (왼쪽)
        // 4,0 || 3, 1 || 2, 2 || 1, 3 || 0, 4
        for (int i = 0; i < 100; i++) {
            diagonalLeft += arr[i][99 - i];
        }
        return Math.max(Math.max(width, height), Math.max(diagonalLeft, diagonalRight));
    }
}
