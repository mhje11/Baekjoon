package baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//baekjoon.queue

public class S_4_10845 {

    public static int[] queue;
    public static int rear = -1;
    public static int currentSize = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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


    }

    public static void push(int X) {
        queue[++rear] = X;
        currentSize++;
    }
    public static void pop() {
        if (currentSize == 0) {
            System.out.println("-1");
        } else {
            System.out.println(queue[rear - currentSize + 1]);
            currentSize--;
        }
    }
    public static void size() {
        if (currentSize <= 0) {
            System.out.println("0");
        } else {
            System.out.println(currentSize);
        }
    }
    public static void empty() {
        if (currentSize == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
    public static void front() {
        if (currentSize == 0) {
            System.out.println("-1");
        } else {
            System.out.println(queue[rear - currentSize + 1]);
        }
    }
    public static void back() {
        if (currentSize == 0) {
            System.out.println("-1");
        } else {
            System.out.println(queue[rear]);
        }
    }
}
