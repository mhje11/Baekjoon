package baekjoon.greedy;

import java.util.Scanner;

public class S_4_2839 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Sugar(input.nextInt()));

    }
    public static int Sugar(int N) {
        int quantity = N / 5;
        int remaining = N % 5;
        while (quantity >= 0) {
            if (remaining % 3 == 0) {
                return quantity + remaining / 3;
            }
            quantity --;
            remaining += 5;
        }
        return -1;

    }
}
