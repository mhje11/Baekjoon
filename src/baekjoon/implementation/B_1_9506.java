package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B_1_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) {
                break;
            }
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                    list.add(i);
                }
            }
            if (sum == num) {
                sb.append(num).append(" = ");
                for (int i = 0; i < list.size(); i++) {
                    if (i == list.size() - 1) {
                        sb.append(list.get(i)).append('\n');
                    } else {
                        sb.append(list.get(i)).append(" + ");
                    }
                }
            } else {
                sb.append(num).append(" is NOT perfect.").append('\n');
            }
        }
        System.out.println(sb);
    }
}
