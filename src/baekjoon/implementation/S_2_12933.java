package baekjoon.implementation;

import java.util.Scanner;
//fail
public class S_2_12933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String duck = sc.nextLine();
        int duckCount = 0;

        if (duck.length() % 5 != 0) {
            System.out.println(-1);
            return;
        }

        boolean isValid = true;
        int[] count = new int[5];
        for (int i = 0; i < duck.length(); i++) {
            if (duck.charAt(i) == 'q') {
                count[0]++;
            } else if (duck.charAt(i) == 'u') {
                if (count[0] < count[1]) {
                    isValid = false;
                    break;
                }
                count[1]++;
            } else if (duck.charAt(i) == 'a') {
                if (count[1] < count[2]) {
                    isValid = false;
                    break;
                }
                count[2]++;
            } else if (duck.charAt(i) == 'c') {
                if (count[2] < count[3]) {
                    isValid = false;
                    break;
                }
                count[3]++;
            } else if (duck.charAt(i) == 'k') {
                if (count[3] < count[4]) {
                    isValid = false;
                    break;
                }
                count[4]++;
            }
        }

        if (!isValid) {
            System.out.println(-1);
        } else {
            duckCount = count[1];
            System.out.println(duckCount);
        }
    }
}