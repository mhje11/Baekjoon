package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class S_5_5648 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Long> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        while (st.hasMoreTokens()) {
            list.add(reverse(st.nextToken()));
        }
        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                list.add(reverse(st.nextToken()));
            }
        }


        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.println(list.get(i));
            }

        }
    }

    public static long reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        String string = sb.reverse().toString();
        return Long.parseLong(string);
    }
}
