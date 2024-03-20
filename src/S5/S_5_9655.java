package S5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//dp

public class S_5_9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if ((N - 1) % 4 == 0 || (N - 3) % 4 == 0) {
            System.out.println("SK");
        } else if (N == 1 || N == 3){
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}
