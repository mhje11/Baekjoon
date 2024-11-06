package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_2_1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0) {
                System.out.println(10);
                continue;
            }

            List<Integer> list = new ArrayList<>();
            int current = a;
            while (!list.contains(current)) {
                list.add(current);
                current = (current * a) % 10;
            }

            int index = (b - 1) % list.size();
            System.out.println(list.get(index));
        }
    }
}
