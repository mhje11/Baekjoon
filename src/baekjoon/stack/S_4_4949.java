package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class S_4_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            if (s.equals(".")) {
                break;
            }
            boolean isBalanced = true;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == ']') {
                    if (stack.isEmpty() || (c == ')' && stack.peek() != '(') || (c == ']' && stack.peek() != '[')) {
                        isBalanced = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (isBalanced && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
