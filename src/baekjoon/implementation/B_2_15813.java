package baekjoon.implementation;

import java.io.*;

public class B_2_15813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        String name = br.readLine();
        int[] score = new int[26];
        int totalScore = 0;
        for (int i = 0; i < 26; i++) {
            score[i] = i + 1;
        }
        for (int i = 0; i < length; i++) {
            char ch = name.charAt(i);
            totalScore += score[ch - 'A'];
        }
        bw.write(Integer.toString(totalScore));
        bw.flush();
    }
}
