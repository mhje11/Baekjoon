package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class S_2_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int size = Integer.parseInt(br.readLine());
        int last = 0;
        for (int i = 0; i < size; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }

    }
}
