package queue;

import java.io.*;
import java.util.StringTokenizer;
//queue, sb로 출력시간줄이기

public class S_4_18258 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static int[] queue;
    public static int rear = -1;
    public static int currentSize = 0;
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        queue = new int[N];
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    pop();
                    break;
                case "size" :
                    size();
                    break;
                case "empty" :
                    empty();
                    break;
                case "front" :
                    front();
                    break;
                case "back" :
                    back();
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int X) {
        queue[++rear] = X;
        currentSize++;
    }
    public static void pop() {
        if (currentSize == 0) {
            sb.append("-1").append('\n');
        } else {
            sb.append(queue[rear - currentSize + 1]).append('\n');
            currentSize--;
        }
    }
    public static void size() {
        if (currentSize <= 0) {
            sb.append("0").append('\n');
        } else {
            sb.append(currentSize).append('\n');
        }
    }
    public static void empty() {
        if (currentSize == 0) {
            sb.append("1").append('\n');
        } else {
            sb.append("0").append('\n');
        }
    }
    public static void front() {
        if (currentSize == 0) {
            sb.append("-1").append('\n');
        } else {
            sb.append(queue[rear - currentSize + 1]).append('\n');
        }
    }
    public static void back() {
        if (currentSize == 0) {
            sb.append("-1").append('\n');
        } else {
            sb.append(queue[rear]).append('\n');
        }
    }
}
