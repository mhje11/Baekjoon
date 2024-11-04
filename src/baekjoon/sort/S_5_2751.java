package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
//정렬 빠르게
//baekjoon.sort

public class S_5_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        for (int i = 0; i < N; i++) {
            sb.append(list.get(i)).append('\n');

        }
        System.out.println(sb);
    }
}
