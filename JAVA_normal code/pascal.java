public class pascal {
    public static void main(String[] args) {
        int n = 10;
        pascaltri(n);
    }

    public static void pascaltri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            int c = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(c + " ");
                c = c * (i - k) / k;
            }
            System.out.println();
        }
    }

}
