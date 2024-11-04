package baekjoon.hashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class S_5_7785_V2 {
    //시간 초과 시간복잡도가 o(n)
    //map 사용시 시간복잡도가 o(1)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (st.nextToken().equals("enter")) {
                list.add(s);
            }else {
                list.remove(s);
            }
        }
        list.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .forEach(System.out::println);
    }
}
