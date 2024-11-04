package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_3_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            //25 10 5 1
            int money = Integer.parseInt(br.readLine());
            if (money >= 25) {
                sb.append(money / 25).append(" ");
                money %= 25;
            } else {
                sb.append(0).append(" ");
            }
            if (money >= 10) {
                sb.append(money / 10).append(" ");
                money %= 10;
            } else {
                sb.append(0).append(" ");
            }
            if (money >= 5) {
                    sb.append(money / 5).append(" ");
                    money %= 5;
            } else {
                sb.append(0).append(" ");
            }
            if (money > 0) {
                sb.append(money / 1);
            } else {
                sb.append(0).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
