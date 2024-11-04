package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_3_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int floor = N % H;
            int room = N / H + 1;
            if (room == 0) {
                room = 1;
            }
            if (floor == 0) {
                floor = H;
                room--;
            }
            sb.append(floor);
            if (room < 10) {
                sb.append(0);
            }
            sb.append(room).append('\n');
        }
        System.out.println(sb);
    }
}
