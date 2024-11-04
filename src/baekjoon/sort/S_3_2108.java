package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class S_3_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(ArithmeticMean(arr));
        System.out.println(median(arr));
        System.out.println(mode(arr));
        System.out.println(range(arr));
    }

    public static int ArithmeticMean(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double avg = (double) sum / arr.length;
        return (int) Math.round(avg);
    }

    public static int median(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }

    public static int mode(int[] arr) {
        int[] frequency = new int[8001];
        for (int i : arr) {
            frequency[i + 4000]++;
        }

        int maxFreq = 0;
        ArrayList<Integer> modeList = new ArrayList<>();
        for (int i = 0; i < 8001; i++) {
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
                modeList.clear();
                modeList.add(i - 4000);
            } else if (frequency[i] == maxFreq) {
                modeList.add(i - 4000);
            }
        }

        if (modeList.size() > 1) {
            Collections.sort(modeList);
            return modeList.get(1);
        } else {
            return modeList.get(0);
        }

    }
    public static int range(int[] arr) {
        if (arr.length == 1) {
            return 0;
        } else {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i : arr) {
                if (max < i) {
                    max = i;
                }
                if (min > i) {
                    min = i;
                }
            }
            return max - min;
        }
    }
}
