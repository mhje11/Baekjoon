package baekjoon.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class G_4_1477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        List<Integer> rest = new ArrayList<>();
        rest.add(0);
        rest.add(l);

        if (n > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                rest.add(Integer.parseInt(st.nextToken()));
            }
        }


        Collections.sort(rest);


        for (int i = 0; i < m; i++) {
            int maxIndex = 0;
            int maxGap = 0;

            for (int j = 1; j < rest.size(); j++) {
                int gap = rest.get(j) - rest.get(j - 1);
                if (gap > maxGap) {
                    maxGap = gap;
                    maxIndex = j;
                }
            }

            // 가장 큰 구간의 중간에 휴게소를 추가
            int newRest = (rest.get(maxIndex) + rest.get(maxIndex - 1)) / 2;

            // binarySearch를 이용해 적절한 위치에 삽입
            int insertIndex = Collections.binarySearch(rest, newRest);
            if (insertIndex < 0) {
                insertIndex = -(insertIndex + 1);
            }
            rest.add(insertIndex, newRest);
        }

        // 최종적으로 모든 구간의 최대 길이를 찾음
        int answer = 0;
        for (int i = 1; i < rest.size(); i++) {
            answer = Math.max(answer, rest.get(i) - rest.get(i - 1));
        }

        System.out.println(answer);
    }
}
