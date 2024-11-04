package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_3_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] x = new int[3];
        int[] y = new int[3];
        int fourthX;
        int fourthY;

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        if (x[0] == x[1]) {
            fourthX = x[2];
        } else if (x[0] == x[2]) {
            fourthX = x[1];
        } else {
            fourthX = x[0];
        }

        if (y[0] == y[1]) {
            fourthY = y[2];
        } else if (y[0] == y[2]) {
            fourthY = y[1];
        } else {
            fourthY = y[0];
        }

        System.out.println(fourthX + " " + fourthY);

    }
}
