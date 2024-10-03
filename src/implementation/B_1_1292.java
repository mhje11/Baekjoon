package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int sum = 0;
        int currentNumber = 1;
        int count = 0;

        for (int i = 1; i <= b; i++) {
            if (count == currentNumber) {
                currentNumber++;
                count = 0;
            }
            count++;

            if (i >= a) {
                sum += currentNumber;
            }
        }

        System.out.println(sum);
    }
}
