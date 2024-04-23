package implementation;

import java.util.Scanner;
//implementation

public class B_3_5597 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean[] arr = new boolean[31];
    int N = 0;
    while (N < 28) {
        int number = sc.nextInt();
        arr[number] = true;
        N++;
    }
    for (int i = 1; i <= 30; i++) {
        if (arr[i] == false) {
            System.out.println(i);
        }
    }
    }
}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean[] arr = new boolean[31];
//
//        for (int i = 0; i < 28; i++) {
//            int x = sc.nextInt();
//            arr[x] = true;
//        }
//        for (int i = 1; i <= 30; i++) {
//            if (!arr[i]) {
//                System.out.println(i);
//            }
//        }
//
//    }