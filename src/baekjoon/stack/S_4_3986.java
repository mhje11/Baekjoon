package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S_4_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            if (stack.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
