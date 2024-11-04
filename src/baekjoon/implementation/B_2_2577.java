package baekjoon.implementation;

import java.util.Scanner;

public class B_2_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiply = 1;
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            multiply *= a;
        }
        String str = String.valueOf(multiply);
        int[] arr = new int[10];
        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            arr[digit]++;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 9; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }
}
