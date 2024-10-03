package simulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_4_2578 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[5][5];
        int[][] arr2 = new int[5][5];
        int count = 0;

        // 빙고판 숫자 입력 받기
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 사회자가 부르는 숫자 입력 받기
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());
                // 부른 숫자와 빙고판의 숫자가 같으면 1로 표시
                for (int x = 0; x < 5; x++) {
                    for (int y = 0; y < 5; y++) {
                        if (arr[x][y] == num) {
                            arr2[x][y] = 1;
                        }
                    }
                }
                // 빙고 체크
                if (checkBingo(arr2)) {
                    System.out.println(count + 1);
                    return;
                }
                count++;
            }
        }
    }

    // 빙고를 외칠 수 있는지 체크하는 메서드
    public static boolean checkBingo(int[][] arr2) {
        int bingoCount = 0;
        // 가로 체크
        for (int i = 0; i < 5; i++) {
            boolean bingo = true;
            for (int j = 0; j < 5; j++) {
                if (arr2[i][j] == 0) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) {
                bingoCount++;
            }
        }
        // 세로 체크
        for (int i = 0; i < 5; i++) {
            boolean bingo = true;
            for (int j = 0; j < 5; j++) {
                if (arr2[j][i] == 0) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) {
                bingoCount++;
            }
        }
        // 대각선 체크
        //왼 -> 오
        boolean bingo = true;
        for (int i = 0; i < 5; i++) {
            if (arr2[i][i] == 0) {
                bingo = false;
                break;
            }
        }
        if (bingo) {
            bingoCount++;
        }
        bingo = true;
        //오 -> 왼
        for (int i = 0; i < 5; i++) {
            if (arr2[i][4 - i] == 0) {
                bingo = false;
                break;
            }
        }
        if (bingo) {
            bingoCount++;
        }
        return bingoCount >= 3;
    }
}
