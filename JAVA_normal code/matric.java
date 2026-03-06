import java.util.Scanner;

public class matric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        r = sc.nextInt();
        c = sc.nextInt();
        int[][] array = new int[5][5];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the value [" + i + " " + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
