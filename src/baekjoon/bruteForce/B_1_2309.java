package baekjoon.bruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class B_1_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] height = new int[9];
        int sum = 0;
        int not1 = 0;
        int not2 = 0;
        for (int i = 0; i < 9; i++) {
            height[i] = sc.nextInt();
            sum += height[i];
        }
        Arrays.sort(height);
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - (height[i] + height[j]) == 100) {
                    not1 = i;
                    not2 = j;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i == not1 || i == not2) {
                continue;
            }
            System.out.println(height[i]);
        }
    }
}
