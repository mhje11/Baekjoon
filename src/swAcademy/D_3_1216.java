package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_3_1216 {
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            int t = Integer.parseInt(br.readLine());
            arr = new char[100][100];
            for (int j = 0; j < 100; j++) {
                String s = br.readLine();
                for (int k = 0; k < 100; k++) {
                    arr[j][k] = s.charAt(k);
                }
            }
            int max = palindrome();
            sb.append("#").append(t).append(" ").append(max).append('\n');
        }
        System.out.println(sb);
    }


    public static int palindrome() {
        //가로 펠린드롬검사
        int width = Integer.MIN_VALUE;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                StringBuilder widthSb = new StringBuilder();
                for (int k = j; k < 100; k++) {
                    widthSb.append(arr[i][k]);
                    if (isPalindrome(widthSb.toString())) {
                        width = Math.max(width, widthSb.length());
                    }
                }
            }
        }

        //세로 검사
        int height = Integer.MIN_VALUE;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                StringBuilder heightSb = new StringBuilder();
                for (int k = j; k < 100; k++) {
                    heightSb.append(arr[k][i]);
                    if (isPalindrome(heightSb.toString())) {
                        height = Math.max(height, heightSb.length());
                    }
                }
            }
        }
        return Math.max(height, width);
    }


    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        String original = sb.toString();
        return original.equals(sb.reverse().toString());
    }
}
