package math;

import java.util.Arrays;
import java.util.Scanner;
//Math

public class B_1_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        double sum = 0;
        double avg = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        max = arr[N - 1];
        for (int i = 0; i < N; i++) {
            sum += (double) arr[i] / max * 100;
        }
        avg = (double) sum / N;
        System.out.println(avg);
    }
}
