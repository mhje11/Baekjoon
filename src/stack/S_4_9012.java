package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S_4_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test != 0) {
            String line = br.readLine();
            if (isVPS(line)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            test--;
        }
    }

    //stack이 비어있을때 ')'나오면 짝이 맞을 수가 없음
    public static boolean isVPS(String line) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty()) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
