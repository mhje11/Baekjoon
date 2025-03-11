package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Map;
import java.util.NavigableMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class S_5_5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        NavigableMap<LocalDate, String> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            LocalDate date = LocalDate.of(year, month, day);
            map.put(date, name);
        }

        System.out.println(map.lastEntry().getValue());
        System.out.println(map.firstEntry().getValue());

    }
}
