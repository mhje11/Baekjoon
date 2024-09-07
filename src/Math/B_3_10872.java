package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_3_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int multiply = 1;
        if (n == 0 || n == 1) {
            System.out.println(1);
        } else {
            while (n > 1) {
                multiply *= n;
                n--;
            }
            System.out.println(multiply);
        }
    }
}
