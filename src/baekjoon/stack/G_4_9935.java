package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class G_4_9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String bomb = br.readLine();

        Stack<Character> stack = new Stack<>();
        int bombLength = bomb.length();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if (stack.size() >= bombLength) {
                boolean isMatch = true;
                for (int j = 0; j < bombLength; j++) {
                    if (stack.get(stack.size() - bombLength + j) != bomb.charAt(j)) {
                        isMatch = false;
                        break;
                    }
                }

                if (isMatch) {
                    for (int j = 0; j < bomb.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("FRULA");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Character c : stack) {
                sb.append(c);
            }
            System.out.println(sb);
        }


    }
}
