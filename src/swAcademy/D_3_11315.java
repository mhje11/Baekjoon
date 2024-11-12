package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class D_3_11315 {
    static int N;
    static int[][] arr;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N][N];
            for (int j = 0; j < N; j++) {
                String s = br.readLine();
                for (int k = 0; k < N; k++) {
                    if (s.charAt(k) == 'o') {
                        arr[j][k] = 1;
                    }
                }
            }
            boolean isPossible = false;
            for (int j = 0; j < N; j++) {
                if (isPossible) {
                    break;
                }
                for (int k = 0; k < N; k++) {
                    if (hasFive(j, k) && arr[j][k] == 1) {
                        isPossible = true;
                        break;
                    }
                }
            }
            if (isPossible) {
                sb.append("#").append(i).append(" ").append("YES").append('\n');
            } else {
                sb.append("#").append(i).append(" ").append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }

    public static boolean hasFive(int x, int y) {
        int[] dx = new int[]{0, 0, 1, 1, 1, -1, -1, -1};
        int[] dy = new int[]{-1, 1, -1, 1, 0, 0, 1, -1};
        for (int i = 0; i < 8; i++) {
            int count = 1;
            int nx = x + dx[i];
            int ny = y + dy[i];

            while (nx >= 0 && nx < N && ny >=0 && ny < N && arr[nx][ny] == 1) {
                count++;
                if (count == 5) {
                    return true;
                }

                nx += dx[i];
                ny += dy[i];
            }
        }
        return false;
    }
}
