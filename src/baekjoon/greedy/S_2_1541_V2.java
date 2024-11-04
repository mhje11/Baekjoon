package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2_1541_V2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();


        int result = 0;
        String[] split = s.split("-");
        result += sum(split[0]);
        for (int i = 1; i < split.length; i++) {
            result -= sum(split[i]);
        }
        System.out.println(result);
    }

    public static int sum(String s) {
        int sum = 0;
        String[] split = s.split("\\+");
        for (String string : split) {
            sum += Integer.parseInt(string);
        }
        return sum;
    }
}
