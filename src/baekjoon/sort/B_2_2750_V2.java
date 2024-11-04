package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class B_2_2750_V2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        TreeSet<Integer> sort = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            sort.add(a);
        }
        StringBuilder sb = new StringBuilder();
        for (Integer i : sort) {
            sb.append(i).append('\n');
        }
        System.out.println(sb.toString().trim());
    }
}
