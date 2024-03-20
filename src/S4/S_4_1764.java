package S4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;
//String, Sort, Hash

public class S_4_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> hear = new HashSet<>();
        HashSet<String> see = new HashSet<>();


        for (int i = 0; i < N; i++) {
            hear.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            see.add(br.readLine());
        }

        hear.retainAll(see);
        //hashset 교집합구하기
        String[] result = hear.toArray(new String[hear.size()]);
        //hash를 배열로 변환
        Arrays.sort(result);
        System.out.println(result.length);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
