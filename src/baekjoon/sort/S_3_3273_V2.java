package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_3_3273_V2 {
    //두 포인터 기법 --> left(수열의 시작), right(수열의 끝) 단 정렬되어 있어야함
    //두수의 합이 x 보다 작으면 left 오른쪽으로 x보다 크면 right 왼쪽으로 이동
    //합이 x와 같으면 count++, 두포인터 모두 이동
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        int left = 0;
        int right = n - 1;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == x) {
                count++;
                left++;
                right--;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(count);
    }
}
