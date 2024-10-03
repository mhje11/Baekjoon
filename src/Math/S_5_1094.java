package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//비트 마스킹 2진법으로 변환시 필요한 1의 갯수 --> 필요한 막대의 갯수
public class S_5_1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int count = 0;

        while (x > 0) {
            if (x % 2 == 1) {
                count++;
            }
            x /= 2;
        }

        System.out.println(count);
    }
}
