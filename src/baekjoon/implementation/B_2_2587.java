package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_2_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(a);

        for (int i : a) {
            sum += i;
        }
        System.out.println(sum / 5);
        System.out.println(a[a.length / 2]);
    }
}
