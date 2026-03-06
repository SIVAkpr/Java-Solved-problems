import java.util.Scanner;

public class addbinarystring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b, sum;
        a = sc.next();
        b = sc.next();
        sum = addbinary(a, b);
        System.out.print(a + " " + b + " " + "=" + sum);
        sc.close();
    }

    public static String addbinary(String a, String b) {
        int num1, num2;
        num1 = Integer.parseInt(a, 2);
        num2 = Integer.parseInt(b, 2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }

}
