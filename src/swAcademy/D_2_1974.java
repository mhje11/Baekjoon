package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_2_1974 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            int[][] arr = new int[9][9];
            for (int j = 0; j < 9; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < 9; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            sb.append("#").append(i).append(" ");
            if (isValid(arr)) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static boolean isValid(int[][] arr) {
        boolean[] num = new boolean[10];
        //가로 검사
        for (int i = 0; i < 9; i++) {
            reset(num);
            for (int j = 0; j < 9; j++) {
                if (!num[arr[i][j]]) {
                    num[arr[i][j]] = true;
                } else if (num[arr[i][j]]) {
                    return false;
                }
            }
        }
        //세로검사
        for (int i = 0; i < 9; i++) {
            reset(num);
            for (int j = 0; j < 9; j++) {
                if (!num[arr[j][i]]) {
                    num[arr[j][i]] = true;
                } else if (num[arr[j][i]]) {
                    return false;
                }
            }
        }
        //3 x 3 검사
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                reset(num);

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (!num[arr[i + k][j + l]]) {
                            num[arr[i + k][j + l]] = true;
                        } else if (num[arr[i + k][j + l]]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private static void reset(boolean[] num) {
        for (int i = 1; i < 10; i++) {
            num[i] = false;
        }
    }
}
