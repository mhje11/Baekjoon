package swAcademy;


import java.util.Scanner;

public class D_2_1945 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] prime = {2, 3, 5, 7, 11};
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[5];
            for (int j = 0; j < prime.length; j++) {
                while (n % prime[j] == 0) {
                    arr[j]++;
                    n /= prime[j];
                }
            }
            sb.append("#").append(i).append(" ");
            for (int i1 : arr) {
                sb.append(" ").append(i1);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
