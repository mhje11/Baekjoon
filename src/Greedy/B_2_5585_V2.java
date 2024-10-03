package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2_5585_V2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int money = 1000 - n;
        int count = 0;
        int[] coins = {500, 100, 50, 10, 5, 1};
        for (int coin : coins) {
            count += money / coin;
            money %= coin;
        }
        System.out.println(count);
    }
}

