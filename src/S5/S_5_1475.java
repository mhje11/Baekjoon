package S5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_5_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(checkNumber(N));

    }

    static int checkNumber(int num) {
        int count = 1;
        boolean[] arr = new boolean[10];
        while (num > 0) {
            int digit = num % 10;
            //!arr 사용 x arr 사용 o
            //사용하면 true 사용하지 않으면 false 처리해서 로직 처리
            if (!arr[digit]) {
                arr[digit] = true;
            } else if (arr[6] && !arr[9] && digit == 6) {
                arr[9] = true;
            } else if (arr[9] && !arr[6] && digit == 9) {
                arr[6] = true;
            }
            else {
                count++;
                for (int i = 0; i < 10; i++) {
                    arr[i] = false;
                } arr[digit] = true;
            } num /= 10;
        }
        return count;
    }
}

