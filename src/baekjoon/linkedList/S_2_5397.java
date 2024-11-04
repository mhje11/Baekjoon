package baekjoon.linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class S_2_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            String s = br.readLine();
            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> it = list.listIterator();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '-') {
                    if (it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }
                } else if (c == '<') {
                    if (it.hasPrevious()) {
                        it.previous();
                    }
                } else if (c == '>') {
                    if (it.hasNext()) {
                        it.next();
                    }
                } else {
                    it.add(c);
                }
            }
            for (Character c : list) {
                sb.append(c);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
