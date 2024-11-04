package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int money = 1000 - n;
        int count = 0;

        if (money >= 500) {
            money -= 500;
            count++;
        }
        if (money >= 100) {
            count += money / 100;
            money = money % 100;
        }
        if (money >= 50) {
            count += money / 50;
            money = money % 50;
        }
        if (money >= 10) {
            count += money / 10;
            money = money % 10;
        }
        if (money >= 5) {
            count += money / 5;

            money = money % 5;
        }
        if (money >= 1) {
            count += money / 1;

            money = money % 1;
        }

        System.out.println(count);
    }
}

