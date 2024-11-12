package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_2_1979 {
    static int N;
    static int K;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            arr = new int[N][N];
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < N; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            sb.append("#").append(i).append(" ").append(width() + height()).append('\n');
        }
        System.out.println(sb);
    }


    public static int width() {
        int count = 0;
        for (int i = 0; i < N; i++) {
            int count1 = 0;
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1) {
                    count1++;
                } else {
                    if (count1 == K) {
                        count++;
                    }
                    count1 = 0;
                }
            }
            if (count1 == K) {
                count++;
            }
        }
        return count;
    }

    public static int height() {
        int count = 0;
        for (int i = 0; i < N; i++) {
            int count1 = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j][i] == 1) {
                    count1++;
                } else {
                    if (count1 == K) {
                        count++;
                    }
                    count1 = 0;
                }
            }
            if (count1 == K) {
                count++;
            }
        }
        return count;
    }
}
