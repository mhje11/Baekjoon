package Math;

import java.util.Scanner;
//Math
public class B_2_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int room = 1;
        while (room < N ) {
            room += count * 6;
            count++;
        }
        System.out.println(count);
    }
}
