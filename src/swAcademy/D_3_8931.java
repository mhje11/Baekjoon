package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class D_3_8931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            int k = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < k; j++) {
                int num = Integer.parseInt(br.readLine());
                if (!stack.isEmpty() && num == 0) {
                    stack.pop();
                } else {
                    stack.add(num);
                }
            }

            int sum = 0;
            while (!stack.isEmpty()) {
                sum += stack.pop();
            }
            sb.append("#").append(i).append(" ").append(sum).append('\n');
        }

        System.out.println(sb);
    }
}
