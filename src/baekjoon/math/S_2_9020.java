package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2_9020 {
    static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //소수 미리 다 구해두기
        getPrime();
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            // n 이 8이면 4부터 시작해서 가장 가까운 소수쌍 찾아감 3, 5
            int first = n / 2;
            int second = n / 2;
            while (true) {
                if (!prime[first] && !prime[second]) {
                    System.out.println(first + " " + second);
                    break;
                }
                first--;
                second++;
            }
        }

    }

    public static void getPrime() {
        //소수 아니면 true
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }

        }
    }
}
