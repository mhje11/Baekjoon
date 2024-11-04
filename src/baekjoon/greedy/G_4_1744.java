package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class G_4_1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 1) {
                positive.add(num);
            } else if (num <= 0) {
                negative.add(num);
            } else {
                result += num;
            }
        }

        Collections.sort(positive, Collections.reverseOrder());
        Collections.sort(negative);

        for (int i = 0; i < positive.size() - 1; i += 2) {
            result += positive.get(i) * positive.get(i + 1);
        }
        if (positive.size() % 2 == 1) {
            result += positive.get(positive.size() - 1);
        }

        for (int i = 0; i < negative.size() - 1; i += 2) {
            result += negative.get(i) * negative.get(i + 1);
        }
        if (negative.size() % 2 == 1) {
            result += negative.get(negative.size() - 1);
        }

        System.out.println(result);


    }
}
