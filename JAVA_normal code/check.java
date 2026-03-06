import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter " + (i + 1) + " number: ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        if (num[0] == num[1]) {
            if (num[1] == num[2]) {
                if (num[2] == num[3]) {
                    System.out.print("given 3 numbers are equal");
                }
            }
        } else {
            System.out.print("Given 4 are not equal");
        }
        sc.close();
    }
}