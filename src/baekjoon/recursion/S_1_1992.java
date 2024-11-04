package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1_1992 {
    static int N;
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        recursion(0, 0, N);
        System.out.println(sb);

    }

    public static void recursion(int x, int y, int size) {
        if (isSame(x, y, size)) {
            int value = arr[x][y];
            sb.append(value);
            return;
        }
        sb.append("(");
        int newSize = size / 2;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                recursion(x + i * newSize, y + j * newSize, newSize);
            }
        }
        sb.append(")");
    }

    public static boolean isSame(int x, int y, int size) {
        int value = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[x][y] != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
