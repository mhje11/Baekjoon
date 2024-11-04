package baekjoon.implementation;

import java.util.Scanner;

public class B_2_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String ox = sc.nextLine();
            int count = 0;
            int sum = 0;
            for (int j = 0; j < ox.length(); j++) {
                boolean flag = false;
                if (ox.charAt(j) == 'O') {
                    if (!flag) {
                        flag = true;
                        count++;
                        sum += count;
                    } else if(flag){
                    sum += count + 1;
                    }
                } else if (ox.charAt(j) == 'X') {
                    flag = false;
                    count = 0;
                }
            }
            sb.append(sum).append('\n');

        }
        System.out.println(sb);

    }
}
