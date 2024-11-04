package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Greedy

public class S_5_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long sum = 0;
        long count = 0;
        while (sum <= S) {
            count++;
            sum += count;
        }
        System.out.println(count - 1);
    }
}
