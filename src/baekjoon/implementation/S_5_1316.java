package baekjoon.implementation;

import java.util.Scanner;
//baekjoon.implementation, String

public class S_5_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt();
        sc.nextLine();
        String[] word = new String[N];
        for (int i = 0; i < N; i++) {
            word[i] = sc.nextLine();
        }
        for (int i = 0; i < N; i++) {
            if (isContinuousWord(word[i]) == true) {
                count++;
            }
        }
        System.out.println(count);

    }

    static boolean isContinuousWord(String word) {
        boolean[] visited = new boolean[26];
        int prev = 0;
        for (int i = 0; i < word.length(); i++) {
            int now = word.charAt(i);

            if (prev != now) {
                if (visited[now - 'a'] == false) {
                    visited[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }

        }
        return true;
    }

}
