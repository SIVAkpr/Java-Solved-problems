import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("sum is:" + (x + y));

        sc.close();
    }
}