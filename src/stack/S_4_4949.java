package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class S_4_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = st.nextToken();
            if (line.equals(".")) {
                break;
            }
            if (isBalance(line)) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }
        }
        System.out.println(sb.toString().trim());
    }

    public static boolean isBalance(String line) {
        Stack<String> stack = new Stack<>();
        return false;
    }
}
