package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2_1780 {
    static int[][] paper;
    static int[] counts = new int[3];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divideAndConquer(0, 0, n);

        System.out.println(counts[0]);
        System.out.println(counts[1]);
        System.out.println(counts[2]);

    }

    public static void divideAndConquer(int x, int y, int size) {
        if (checkSame(x, y, size)) {
            int value = paper[x][y];
            counts[value + 1]++;
            return;
        }

        int newSize = size / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                divideAndConquer(x + i * newSize, y + j * newSize, newSize);
            }
        }
    }

    public static boolean checkSame(int x, int y, int size) {
        int value = paper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != value) {
                    return false;
                }
            }
        }
        return true;
    }

}
