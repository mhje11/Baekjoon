package implementation;

//예제는 정답인데, 틀렸대요.. 반례 케이스 뭐가 있을까요..?

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int z = 0; z < t; z++) {
            int h = scanner.nextInt(); //높이
            int w = scanner.nextInt(); // 가로
            int n = scanner.nextInt();  // 번째 손님
            int[][] arr = new int[h][w];
            int k = 1;
            int yy = 0;
            int xx = 0;

            for (int x = 0; x < w; x++) {
                for (int y = h - 1; y >= 0; y--) {
                    arr[y][x] = k++;
                    if (k == n) {
                        yy = y;
                        xx = x;
                    }
                }
            }
            int yyy = (h - yy +1) * 100;
            int ret = yyy + (xx+1);

            System.out.println(ret);
        }
    }
}

