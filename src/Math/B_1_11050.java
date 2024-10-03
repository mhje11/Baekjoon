package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(binomialCoefficient(a, b));
    }

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k -1) + binomialCoefficient(n - 1, k);
    }
}
