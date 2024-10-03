package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2_10870 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];

        if (n == 0) {
            System.out.println(0);
        }
        else if (n == 1) {
            System.out.println(1);
        } else {
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i <= n; i++) {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
            System.out.println(arr[n]);
        }

    }
}
