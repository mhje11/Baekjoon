package baekjoon.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class G_5_1759 {
    static int L;
    static int C;
    static char[] arr;
    static char[] result;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new char[C];
        result = new char[L];

        String s = br.readLine();
        String[] split = s.split(" ");
        for (int i = 0; i < C; i++) {
            arr[i] = split[i].charAt(0);
        }

        Arrays.sort(arr);
        backtracking(0, 0);
        System.out.println(sb.toString().trim());

    }

    public static void backtracking(int depth, int start) {
        if (depth == L) {
            if (isValid()) {
                for (int i = 0; i < L; i++) {
                    sb.append(result[i]);
                }
                sb.append('\n');
            }
            return;
        }

        for (int i = start; i < C; i++) {
            result[depth] = arr[i];
            backtracking(depth + 1, i + 1);
        }


    }

    private static boolean isValid() {
        int vowels = 0; //모음
        int consonants = 0; // 자음
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 'a' || result[i] == 'e' || result[i] == 'i' || result[i] == 'o' || result[i] == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        if (vowels >= 1 && consonants >= 2) {
            return true;
        }
        return false;
    }
}
