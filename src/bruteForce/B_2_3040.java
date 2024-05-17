package bruteForce;

import java.util.Scanner;

public class B_2_3040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;
        int not1 = 0;
        int not2 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - (arr[i] + arr[j]) == 100) {
                    not1 = arr[i];
                    not2 = arr[j];
                }
            }
        }
        for (int i : arr) {
            if (i == not1 || i == not2) {
                continue;
            }
            System.out.println(i);
        }
    }
}
