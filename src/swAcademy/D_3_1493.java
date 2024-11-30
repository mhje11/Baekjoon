package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_3_1493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            int[] pCoord = getCoordinate(p);
            int[] qCoord = getCoordinate(q);
            int resultX = pCoord[0] + qCoord[0];
            int resultY = pCoord[1] + qCoord[1];
            int resultValue = getValue(resultX, resultY);


            sb.append("#").append(i).append(" ").append(resultValue).append('\n');
        }
        System.out.println(sb);
    }

    public static int getValue(int x, int y) {
        return (x + y - 2) * (x + y - 1) / 2 + x;
    }

    public static int[] getCoordinate(int value) {
        int sum = 1;
        int line = 1;
        while (sum + line <= value) {
            sum += line;
            line++;
        }
        int x = value - sum + 1;
        int y = line - x + 1;
        return new int[]{x, y};
    }
}
