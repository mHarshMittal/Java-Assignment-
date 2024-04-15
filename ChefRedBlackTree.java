import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Q = s.nextInt();
        int[] c = new int[2 * Q];
        int[] l = new int[2 * Q];
        int[] r = new int[2 * Q];

        for (int i = 1; i < 2 * Q; i++) {
            l[i] = 2 * i;
            r[i] = 2 * i + 1;
        }

        for (int q = 0; q < Q; q++) {
            int t = s.nextInt();
            if (t == 1) {
                for (int i = 1; i < 2 * Q; i++) {
                    c[i] = 1 - c[i];
                }
            } else {
                int x = s.nextInt();
                int y = s.nextInt();
                int result = 0;
                while (x <= y) {
                    if (t == 2) {
                        result += c[x] == 0 ? 1 : 0;
                    } else {
                        result += c[x] == 1 ? 1 : 0;
                    }
                    x = (x % 2 == 0) ? x / 2 : (x - 1) / 2;
                    y = (y % 2 == 0) ? y / 2 : (y - 1) / 2;
                }
                System.out.println(result);
            }
        }
    }
}
