package baekjoon.recursion;


import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class S_1_1991 {
    static int N;
    static char[][] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        tree = new char[26][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char parent = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            tree[parent - 'A'][0] = left;
            tree[parent - 'A'][1] = right;

        }

        StringBuilder sb = new StringBuilder();
        preorder('A', sb);
        sb.append('\n');
        inorder('A', sb);
        sb.append('\n');
        postorder('A', sb);
        System.out.println(sb);

    }

    public static void preorder(char current, StringBuilder sb) {
        if (current == '.') {
            return;
        }
        sb.append(current);
        preorder(tree[current - 'A'][0], sb);
        preorder(tree[current - 'A'][1], sb);
    }

    public static void inorder(char current, StringBuilder sb) {
        if (current == '.') {
            return;
        }
        inorder(tree[current - 'A'][0], sb);
        sb.append(current);
        inorder(tree[current - 'A'][1], sb);
    }

    public static void postorder(char current, StringBuilder sb) {
        if (current == '.') {
            return;
        }

        postorder(tree[current - 'A'][0], sb);
        postorder(tree[current - 'A'][1], sb);
        sb.append(current);
    }


}
