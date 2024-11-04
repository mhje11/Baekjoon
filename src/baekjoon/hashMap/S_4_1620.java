package baekjoon.hashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S_4_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, String> nameNumber = new HashMap<>();
        Map<String, String> numberName = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            String number = String.valueOf(i);
            nameNumber.put(name, number);
            numberName.put(number, name);
        }

        for (int i = 0; i < m; i++) {
            String quiz = br.readLine();
            if (nameNumber.containsKey(quiz)) {
                System.out.println(nameNumber.get(quiz));
            } else {
                System.out.println(numberName.get(quiz));
            }

        }
    }
}
