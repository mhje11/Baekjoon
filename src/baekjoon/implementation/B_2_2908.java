package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String a = sb.append(st.nextToken()).reverse().toString();
        int num1 = Integer.parseInt(a);
        sb.setLength(0);
        String b = sb.append(st.nextToken()).reverse().toString();
        int num2 = Integer.parseInt(b);

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }



    }
}
