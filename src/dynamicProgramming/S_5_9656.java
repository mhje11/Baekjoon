package dynamicProgramming;

import java.io.*;

public class S_5_9656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        if (N % 2 == 0) {
            bw.write("SK");
        } else {
            bw.write("CY");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

