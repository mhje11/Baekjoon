package implementation;

import java.util.Scanner;

public class B_2_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        boolean[] arr2 = new boolean[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < S.length(); i++) {
            if (arr2[S.charAt(i) - 'a']) {
                continue;
            }
            arr[S.charAt(i) - 'a'] = i;
            arr2[S.charAt(i) - 'a'] = true;
        }
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
