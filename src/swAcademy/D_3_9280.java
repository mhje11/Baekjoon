package swAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class D_3_9280 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] cost = new int[n];

            int benefit = 0;
            for (int j = 0; j < n; j++) {
                cost[j] = Integer.parseInt(br.readLine());
            }
            int[] weight = new int[m + 1];
            for (int j = 1; j <= m; j++) {
                weight[j] = Integer.parseInt(br.readLine());
            }
            int[] parkingLot = new int[n];
            Arrays.fill(parkingLot, -1);
            Queue<Integer> waitingQueue = new LinkedList<>();


            for (int j = 0; j < 2 * m; j++) {
                int carNumber = Integer.parseInt(br.readLine());
                if (carNumber > 0) {
                    boolean parked = false;
                    for (int k = 0; k < n; k++) {
                        if (parkingLot[k] == -1) {
                            parkingLot[k] = carNumber;
                            benefit += cost[k] * weight[carNumber];
                            parked = true;
                            break;
                        }
                    }
                    if (!parked) {
                        waitingQueue.add(carNumber);
                    }
                } else {
                    carNumber = -carNumber;
                    for (int k = 0; k < n; k++) {
                        if (parkingLot[k] == carNumber) {
                            parkingLot[k] = -1;
                            if (!waitingQueue.isEmpty()) {
                                int waitingCar = waitingQueue.poll();
                                parkingLot[k] = waitingCar;
                                benefit += cost[k] * weight[waitingCar];
                            }
                            break;
                        }
                    }
                }

            }
            sb.append("#").append(i).append(" ").append(benefit).append('\n');
        }
        System.out.println(sb);
    }
}
