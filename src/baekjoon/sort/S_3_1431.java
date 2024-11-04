package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class S_3_1431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] serials = new String[n];

        for (int i = 0; i < n; i++) {
            serials[i] = br.readLine();
        }

        Arrays.sort(serials, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                   return s1.length() - s2.length();
                }

                int sum1 = getSumofDigits(s1);
                int sum2 = getSumofDigits(s2);

                if (sum1 != sum2) {
                    return sum1 - sum2;
                }

                return s1.compareTo(s2);
            }

            private int getSumofDigits(String s) {
                int sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (Character.isDigit(c)) {
                        sum += c - '0';
                    }
                }
                return sum;
            }
        });

        for (String serial : serials) {
            System.out.println(serial);
        }
    }
}
