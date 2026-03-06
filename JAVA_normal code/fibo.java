import java.util.Scanner;

public class fibo {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter no. of sequences: ");
        int n = sc.nextInt();
        fibon(n);
        System.out.println();
        System.out.println("Fibo in rec fun");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo_rec(i) + " ");
            sum = sum + fibo_rec(i);
        }
        System.out.println();
        System.out.println("Sum of first " + n + " fibo is:" + sum);
        sc.close();
    }

    public static void fibon(int n) {
        int a, b;
        a = 0;
        b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }

    public static int fibo_rec(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibo_rec(n - 1) + fibo_rec(n - 2);
        }

    }

}
