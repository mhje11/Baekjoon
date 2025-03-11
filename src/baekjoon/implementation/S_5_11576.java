package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class S_5_11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken()); //미래
        int B = Integer.parseInt(st.nextToken()); //정이가 사용
        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        // 10진수 변환
        int decimalNum = 0;
        for (int i = m; i > 0; i--) {
            int num = Integer.parseInt(st.nextToken());
            decimalNum += num * Math.pow(A, i - 1);
        }

        if(decimalNum == 0){
            sb.append(0);
        }
        // B진수로 변환
        while(decimalNum != 0){
            list.add(decimalNum % B);
            decimalNum/=B;
        }
        for (int i = list.size()-1; i >= 0; i--) {
            sb.append(list.get(i) + " ");
        }
        System.out.println(sb);
    }

}
