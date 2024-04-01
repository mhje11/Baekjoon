package bruteForce;

import java.util.Scanner;

public class B_2_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int N = sc.nextInt();
        System.out.println(findConstructor(N));

        }
        public static int findConstructor(int N) {
            for (int i = 1; i < N; i++) {
                if ((isCheck(i) +i ) == N) {
                    return i;
                }
            }
            return 0;
        }

    public static int isCheck(int N) {
        int sum = 0;
        while (N != 0) {
            int digit = N % 10;
            sum += digit;
            N /= 10;
        }
        return sum;
    }
}
