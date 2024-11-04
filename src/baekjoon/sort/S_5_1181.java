package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S_5_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                } else {
                    return o1.compareTo(o2);
                }
            }
        });

        for (String string : list) {
            System.out.println(string);
        }
    }
}
