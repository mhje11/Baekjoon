package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_3_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        StringBuilder sb = new StringBuilder();
        String reverse = sb.append(word).reverse().toString();
        if (word.equals(reverse)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
