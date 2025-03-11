package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class S_5_4659 {
    public static Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if (s.equals("end")) {
                break;
            }

            if (isGoodPassword(s)) {
                sb.append("<").append(s).append("> is acceptable.").append('\n');
            } else {
                sb.append("<").append(s).append("> is not acceptable.").append('\n');
            }
        }
        System.out.println(sb.toString().trim());
    }

    public static boolean isGoodPassword(String s) {
        if (!containsVowel(s)) {
            return false;
        }
        if (isContinuous(s)) {
            return false;
        }
        if (hasConsecutiveSameLetters(s)) {
            return false;
        }

        return true;
    }

    public static boolean containsVowel(String s) {
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isContinuous(String s) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                vowelCount++;
                consonantCount = 0;
            } else {
                consonantCount++;
                vowelCount = 0;
            }

            if (vowelCount == 3 || consonantCount == 3) {
                return true;
            }
        }


        return false;
    }

    public static boolean hasConsecutiveSameLetters(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1) && !(s.charAt(i) == 'e' || s.charAt(i) == 'o'))
                return true;
        }
        return false;
    }
}
