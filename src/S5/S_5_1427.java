package S5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//Sort, String

public class S_5_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String numString = Integer.toString(N);
        char[] arr = new char[numString.length()];
        for (int i = 0; i < numString.length(); i++) {
            arr[i] = numString.charAt(i);
        }
        Arrays.sort(arr);
        for (int i = 0; i < numString.length(); i++) {
            System.out.println(arr[numString.length() - i - 1]);
        }
    }
}
