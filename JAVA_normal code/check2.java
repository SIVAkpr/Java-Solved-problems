import java.util.Scanner;

public class check2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.print(a + " " + b);
        if ((a < 1 && a > 0) && (b < 1 && b > 0)) {
            System.out.print("\nTrue");
        } else {
            System.out.print("\nFalse");
        }
        sc.close();

    }
}