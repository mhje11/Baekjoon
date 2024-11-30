package swAcademy;


import java.util.Scanner;

public class D_3_1217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int t = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int result = recursion(n, m);

            System.out.println("#" + i + " " + result);
        }
    }

    public static int recursion (int n, int m){
        if (m == 0) {
            return 1;
        }
        return n * recursion(n, m - 1);
    }
}
