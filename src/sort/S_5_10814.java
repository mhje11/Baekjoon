package sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
//sort, 인덱스순으로 정렬, 문자열순 으로 정렬
//comparator로 첫번째 요소만 비교하면 첫번째요소 같을시 원래 배열 순서대로 정렬

public class S_5_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[][] member = new String[N][2];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            member[i][0] = st.nextToken();
            member[i][1] = st.nextToken();
        }
        Arrays.sort(member, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });
        for (int i = 0; i < N; i++) {
            sb.append(member[i][0]).append(" ").append(member[i][1]).append('\n');
        }
        bw.write(sb.toString().trim());
        bw.flush();
    }
}
