package baekjoon.dynamicProgramming;

import java.io.*;
//dp, fail

public class S_5_15312 {
    public static void main(String[] args) throws IOException {
        int[] Alphabet = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String A = br.readLine();
        String B = br.readLine();
        if (A.length() == 1 && B.length() == 1) {
            System.out.println("2");
        } else if (A.length() == 0 && B.length() == 0) {
            System.out.println("0");
        } else if (A.length() == 0 && B.length() == 1) {
            System.out.println("1");
        } else if (A.length() == 1 && B.length() == 0) {
            System.out.println("1");
        } else {
            int[][] pair = new int[A.length() + B.length()][];
            for (int i = 0; i < pair.length; i++) {
                pair[i] = new int[pair.length - i];
            }
            for (int i = 0; i < pair[0].length; i++) {
                 if (i % 2 != 0) {
                    pair[0][i] = Alphabet[B.charAt(i / 2) - 'A'];
                } else {
                    pair[0][i] = Alphabet[A.charAt(i / 2) - 'A'];
                }
            }

            for (int i = 1; i < pair.length; i++) {
                for (int j = 0; j < pair[i].length; j++) {
                    pair[i][j] = pair[i - 1][j] + pair[i - 1][j + 1];
                }
            }
            bw.write(Integer.toString(pair[pair.length - 1][0]));
        }
        bw.flush();
    }
}




