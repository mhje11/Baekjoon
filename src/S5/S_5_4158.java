package S5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
//Math, BinarySearch, Hash (fail) 왜 틀린지 모르겠음;


public class S_5_4158 {
    public static void main(String[] args) throws IOException {
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if (N == 0 && M == 0) {
                break;
            }
            for (int i = 0; i < N; i++) {
                A.add(Integer.parseInt(br.readLine()));
            }
            for (int k = 0; k < M; k++) {
                B.add(Integer.parseInt(br.readLine()));
            }
        }
        A.retainAll(B);
        int size = A.size();
        System.out.println(size);
    }
}
