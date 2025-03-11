package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S_4_2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int min = 2; min <= n; min++) {
            if (isPrime[min]) {
                for (int i = min; i <= n; i+= min) {
                    if (isPrime[i]) {
                        isPrime[i] = false;
                        count++;
                        if (count == k) {
                            System.out.println(i);
                            return;
                        }
                    }
                }
            }
        }

    }
}
