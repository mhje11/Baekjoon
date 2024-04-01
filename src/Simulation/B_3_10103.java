package Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_3_10103 {
    public static void main(String[] args) throws IOException {
        int chang = 100;
        int sang = 100;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int diceC = Integer.parseInt(st.nextToken());
            int diceS = Integer.parseInt(st.nextToken());
            if (diceC > diceS) {
                sang -= diceC;
            } else if (diceC < diceS) {
                chang -= diceS;
            }
        }
        System.out.println(chang);
        System.out.println(sang);

    }
}
