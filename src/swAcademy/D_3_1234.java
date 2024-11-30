package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class D_3_1234 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < n; j++) {
                int num = s.charAt(j) - '0';
                if (!stack.isEmpty() && stack.peek() == num) {
                    stack.pop();
                } else {
                    stack.push(num);
                }
            }
            sb.append("#").append(i).append(" ");
            StringBuilder stackSb = new StringBuilder();
            while (!stack.isEmpty()) {
                stackSb.append(stack.pop());
            }
            sb.append(stackSb.reverse().toString().trim()).append('\n');
        }
        System.out.println(sb);
    }
}
