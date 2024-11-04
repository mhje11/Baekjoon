package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String num = br.readLine();
            if (num.equals("0")) {
                break;
            }
            if (isPalindrome(num)) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }

        }

        System.out.println(sb.toString().trim());
    }


    public static boolean isPalindrome(String num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num).reverse();
        if (num.equals(sb.toString())) {
            return true;
        }
        return false;
    }
}
