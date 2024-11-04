package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class S_2_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int current = 1;
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());

            while (current <= target) {
                stack.push(current++);
                sb.append("+").append('\n');
            }

            if (stack.peek() == target) {
                stack.pop();
                sb.append("-").append('\n');
            } else {
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }


    }
}
