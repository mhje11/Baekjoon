package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class G_5_6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() <= height[i]) {
                stack.pop();
            }

            sum += stack.size();
            stack.push(height[i]);
        }
        System.out.println(sum);


    }
}
