package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2_1780_V2 {
    public static int N;
    public static int[][] arr;
    public static int[] count = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divideAndConquer(0, 0, N);

        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }


    public static boolean isSameNumber(int x, int y, int size) {
        int num = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void divideAndConquer(int x, int y, int size) {
        if (isSameNumber(x, y, size)) {
            int num = arr[x][y];
            if (num == -1) {
                count[0]++;
            } else if (num == 0) {
                count[1]++;
            } else {
                count[2]++;
            }
            return;
        }

        int newSize = size / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                divideAndConquer(x + i * newSize, y + j * newSize, newSize);
            }
        }
    }
}
