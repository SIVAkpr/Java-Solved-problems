import java.util.Scanner;

public class floatmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = a * b;
        System.out.print(c);
        sc.close();
    }
}