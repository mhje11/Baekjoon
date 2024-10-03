package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B_2_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        for (Integer i : list) {
            sum += i;
        }
        if (list.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(list.get(0));
        }

    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
