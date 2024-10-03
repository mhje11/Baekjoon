package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] word = new char[15][5];

        for (int i = 0; i < 5; i++) {
            String a = br.readLine();
            for (int j = 0; j < a.length(); j++) {
                word[j][i] = a.charAt(j);
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (word[i][j] != 0) {
                    System.out.print(word[i][j]);
                }
            }
        }

    }
}
