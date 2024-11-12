package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_11285 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] board = {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());

            int sum = 0;
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                int distance = x * x + y * y;

                int score = 0;
                for (int k = 0; k < board.length; k++) {
                    if (distance <= board[k] * board[k]) {
                        score = 10 - k;
                        break;
                    }
                }
                sum += score;
            }
            sb.append("#").append(i).append(" ").append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
