import java.util.Scanner;

public class Exp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        double d;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        d = (Math.pow(b, 2)) - (4 * a * c);
        if (d == 0) {
            x = -b / 2 * a;
            System.out.println("The root is " + x);
        } else if (d > 0) {
            x = (-b + d) / 2 * a;
            y = (-b - d) / 2 * a;
            System.out.println("Valu of both roots are: " + x + " and " + y);
        } else {
            System.out.println("The equation has no roots");
        }
        sc.close();
    }
}
