package baekjoon.implementation;

import java.util.Scanner;

public class B_1_1110 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        int cycle = 0;
        int originalN = N;

        do {
            int ten = N / 10;
            int one = N % 10;

            int sum = ten + one;
            int newNum = (one * 10) + (sum % 10);

            N = newNum;
            cycle++;
        } while (originalN != N);
        System.out.println(cycle);

    }
}
