package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S_4_2217_Ex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] ropes = new int[n];
        int weight = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes);

        for (int i = 0; i < n; i++) {
            int currentWeight = ropes[i] * (n - i);
            weight = Math.max(weight, currentWeight);
        }


        System.out.println(weight);
    }
}
