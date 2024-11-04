package baekjoon.hashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class S_4_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < b; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> copyA = new HashSet<>(setA);
        Set<Integer> copyB = new HashSet<>(setB);

        copyA.removeAll(setB);
        copyB.removeAll(setA);

        System.out.println(copyA.size() + copyB.size());
    }
}
