package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class S_4_1205 {
    public static int n;
    public static int p;
    public static List<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        int score = Integer.parseInt(st.nextToken());

        p = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();

        if (n > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
        }


        if (n == 0) {
            System.out.println(1);
            return;
        }

        int rank = 1;
        int sameCount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > score) {
                rank++;
            } else if (list.get(i) == score) {
                sameCount++;
            } else {
                break;
            }
        }

        if (n == p && (rank + sameCount) > p) {
            System.out.println(-1);
        } else {
            System.out.println(rank);
        }

    }

}
