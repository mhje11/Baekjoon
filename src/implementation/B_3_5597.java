package implementation;

import java.util.Scanner;
//implementation

public class B_3_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int x = sc.nextInt();
            arr[x] = true;
        }
        for (int i = 1; i <= 30; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }

    }
}