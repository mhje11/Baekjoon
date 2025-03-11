package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_5_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] croatianAlphabets = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        for (String alphabet : croatianAlphabets) {
            s = s.replace(alphabet, "*");
        }
        System.out.println(s.length());
    }
}
