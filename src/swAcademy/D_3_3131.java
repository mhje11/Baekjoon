package swAcademy;

public class D_3_3131 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < 1000000; i++) {
            if (isPrime(i)) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }

    public static boolean isPrime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
