package baekjoon.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//baekjoon.bruteForce
public class S_5_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int num = 666;
        int count = 1;
        while (count != N) {
            num++;

            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);


    }
}