package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class S_3_1213 {
    public static Map<Character, Integer> map = new TreeMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();


        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        if (!canPalindrome()) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            System.out.println(makePalindrome());

        }
    }

    public static boolean canPalindrome() {
        int oddCount = 0;
        for (Character c : map.keySet()) {
            if (map.get(c) % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }

    public static String makePalindrome() {
        StringBuilder left = new StringBuilder();
        StringBuilder mid = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (count % 2 != 0) {
                mid.append(c);
            }

            for (int i = 0; i < count / 2; i++) {
                left.append(c);
            }
        }
        return left.toString() + mid.toString() + left.reverse().toString();
    }
}
