package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class D_2_1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            long n = Long.parseLong(br.readLine());
            int countN = 1;
            Set<Integer> set = new HashSet<>();

            while (set.size() < 10) {
                long current = n * countN;
                String num = String.valueOf(current);
                for (int j = 0; j < num.length(); j++) {
                    set.add(num.charAt(j) - '0');
                }
                countN++;
            }
            sb.append("#").append(i).append(" ").append((countN - 1) * n).append('\n');
        }
        System.out.println(sb);
    }
}
