import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int h = s.nextInt();
            if (h == 0) {
                break; 
            }

            int n = (1 << h) - 1; 
            long[] v = new long[n];
            for (int i = 0; i < n; i++) {
                v[i] = s.nextLong();
            }

            long[] p = new long[n];
            for (int i = n - 1; i >= 0; i--) {
                if (2 * i + 1 >= n) {
                    p[i] = v[i];
                } else {
                    p[i] = Math.max(v[i] * p[2 * i + 1], v[i] * p[2 * i + 2]);
                }
            }

            System.out.println(p[0] % 1_000_000_007);
        }
    }
}
