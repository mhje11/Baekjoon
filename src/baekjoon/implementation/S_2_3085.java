package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2_3085 {
    public static int N;
    public static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        int maxVal = Math.max(swapWidth(), swapHeight());
        System.out.println(maxVal);


    }

    public static int swapWidth() {
        int max = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                swap(i, j, i, j + 1);
                max = Math.max(max, max());
                swap(i, j, i, j + 1);
            }
        }
        return max;
    }

    public static int swapHeight() {
        int max = 1;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N; j++) {
                swap(i, j, i + 1, j);
                max = Math.max(max, max());
                swap(i, j, i + 1, j);
            }
        }
        return max;
    }

    public static void swap(int x1, int y1, int x2, int y2) {
        char temp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = temp;
    }

    public static int max() {
        int widthMax = 1;
        int heightMax = 1;

        for (int i = 0; i < N; i++) {
            int temp = 1;
            for (int j = 0; j < N - 1; j++) {
                if (arr[i][j] == arr[i][j + 1]) {
                    temp++;
                } else {
                    widthMax = Math.max(temp, widthMax);
                    temp = 1;
                }
            }
            widthMax = Math.max(temp, widthMax);
        }

        for (int j = 0; j < N; j++) {
            int temp = 1;
            for (int i = 0; i < N - 1; i++) {
                if (arr[i][j] == arr[i + 1][j]) {
                    temp++;
                } else {
                    heightMax = Math.max(temp, heightMax);
                    temp = 1;
                }
            }
            heightMax = Math.max(temp, heightMax);
        }

        return Math.max(widthMax, heightMax);
    }
}
