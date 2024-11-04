package baekjoon.linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class S_2_1406_V2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        List<Character> editor = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            editor.add(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        ListIterator<Character> it = editor.listIterator();
        while (it.hasNext()) {
            it.next();
        }

        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            if (command.equals("L")) {
                if (it.hasPrevious()) {
                    it.previous();
                }
            } else if (command.equals("D")) {
                if (it.hasNext()) {
                    it.next();
                }
            } else if (command.equals("B")) {
                if (it.hasPrevious()) {
                    it.previous();
                    it.remove();
                }
            } else if (command.startsWith("P ")) {
                char ch = command.charAt(2);
                it.add(ch);
            }

        }
        for (Character c : editor) {
            sb.append(c);
        }
        System.out.println(sb);


    }
}
