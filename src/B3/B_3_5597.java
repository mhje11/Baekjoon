package B3;

import java.util.Scanner;

public class B_3_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[32];
        int N = 0;

        while (N < 28) {
            int number = sc.nextInt();
            arr[number] = true;
            N++;
        }


        for (int i = 1; i <= 30; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }

    }
}
