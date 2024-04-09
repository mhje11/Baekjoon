package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1_14467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] cow = new int[10][1];
        for (int i = 0; i < 10; i++) {
            cow[i][0] = -1;
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int cowNum = Integer.parseInt(st.nextToken());
            int position = Integer.parseInt(st.nextToken());
            if (cow[cowNum - 1][0] == -1) {
                cow[cowNum - 1][0] = position;
            } else {
                if (cow[cowNum - 1][0] != position) {
                    count++;
                    cow[cowNum - 1][0] = position;
                }
            }

        }
        System.out.println(count);

    }
}
