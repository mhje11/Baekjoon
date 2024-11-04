package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_4_5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int burger = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            burger = Math.min(burger, Integer.parseInt(br.readLine()));
        }
        int beverage = Integer.MAX_VALUE;
        for (int i = 0; i < 2; i++) {
            beverage = Math.min(beverage, Integer.parseInt(br.readLine()));
        }
        System.out.println(burger + beverage - 50);
    }
}
