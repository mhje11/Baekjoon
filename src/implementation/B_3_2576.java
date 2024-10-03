package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class B_3_2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 != 0) {
                list.add(n);
            }
        }
        Collections.sort(list);
        for (Integer i : list) {
            sum += i;
        }
        if (list.size() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum + " " + list.get(0));
        }
    }
}
