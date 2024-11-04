package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2_2630 {
    static int[][] arr;
    static int n;
    static int[] counts = new int[2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        recursion(0, 0, n);
        System.out.println(counts[0]);
        System.out.println(counts[1]);
    }

    public static void recursion(int x, int y, int size) {
        if (isSame(x, y, size)) {
            int value = arr[x][y];
            counts[value]++;
            return;
        }
        int newSize = size / 2;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                recursion(x + i * newSize, y + j * newSize, newSize);
            }
        }
    }

    public static boolean isSame(int x, int y, int size) {
        int value = arr[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != value) {
                    return false;
                }
            }
        }
        return true;
    }
}
