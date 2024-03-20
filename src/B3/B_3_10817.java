package B3;

import java.util.Arrays;
import java.util.Scanner;
//Sort
public class B_3_10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
