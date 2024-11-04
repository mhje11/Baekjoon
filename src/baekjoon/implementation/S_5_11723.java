package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class S_5_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        String[] newList = {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"
        };


        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.startsWith("all")) {
                list = new ArrayList<>(List.of(newList));
            } else if (s.startsWith("add")) {
                String[] split = s.split(" ");
                String num = split[1];
                if (!list.contains(num)) {
                    list.add(num);
                }
            } else if (s.startsWith("remove")) {
                String[] split = s.split(" ");
                String num = split[1];
                if (list.contains(num)) {
                    list.remove(num);
                }
            } else if (s.startsWith("check")) {
                String[] split = s.split(" ");
                String num = split[1];
                if (list.contains(num)) {
                    sb.append("1").append('\n');
                } else {
                    sb.append("0").append('\n');
                }
            } else if (s.startsWith("toggle")) {
                String[] split = s.split(" ");
                String num = split[1];
                if (!list.contains(num)) {
                    list.add(num);
                } else {
                    list.remove(num);
                }
            } else if (s.startsWith("empty")) {
                list.clear();
            }
        }
        System.out.println(sb);
    }
}
