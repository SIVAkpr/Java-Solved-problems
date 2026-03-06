import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] array = new boolean[3][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the value for[" + i + " " + j + "]:");
                array[i][j] = sc.nextBoolean();
            }
        }
        // print array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((array[i][j] ? "t" : "f") + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}