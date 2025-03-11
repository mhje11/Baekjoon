package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class S_5_2628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());

        List<Integer> widthList = new ArrayList<>();
        List<Integer> heightList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) {
                widthList.add(Integer.parseInt(st.nextToken()));
            } else {
                heightList.add(Integer.parseInt(st.nextToken()));
            }
        }
        widthList.add(0);
        widthList.add(height);
        heightList.add(0);
        heightList.add(width);

        Collections.sort(widthList);
        Collections.sort(heightList);

        int maxWidth = 0;
        for (int i = 1; i < widthList.size(); i++) {
            maxWidth = Math.max(maxWidth, widthList.get(i) - widthList.get(i - 1));
        }

        int maxHeight = 0;
        for (int i = 1; i < heightList.size(); i++) {
            maxHeight = Math.max(maxHeight, heightList.get(i) - heightList.get(i - 1));
        }

        System.out.println(maxHeight * maxWidth);

    }
}
