package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S_4_1026_Ex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> arr = new ArrayList<>();
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);

        while (list.size() > 0) {
            int max = Integer.MIN_VALUE;
            int index = 0;
            int maxIndex = 0;
            for (Integer i : list) {
                index++;
                if (i > max) {
                    max = i;
                    maxIndex = index;
                }
            }
            list.remove(maxIndex - 1);
            sum += arr.get(0) * max;
            arr.remove(0);
        }

        System.out.println(sum);

    }
}
