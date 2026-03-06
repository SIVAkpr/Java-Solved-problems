import java.util.Arrays;

public class array_5Type_sum {
    public static void main(String[] args) {
        prog1();
        prog2();
        transpose();
        rotate();
        removeduplicate();
        removeoccur();
    }

    public static void removeoccur() {
        int[] a = { 1, 2, 3, 4, 1 };
        int k = 1;
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != k) {
                a[index++] = a[i];
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void removeduplicate() {
        int[] a = { 1, 6, 2, 3, 3, 4, 5, 6, 6 };
        int index = 1;
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                a[index++] = a[i];
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void rotate() {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int d = 4;
        int l = array.length;
        while (d != 0) {
            int temp = array[0];
            for (int i = 0; i < (l - 1); i++) {
                array[i] = array[i + 1];
            }
            array[l - 1] = temp;
            d = d - 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void transpose() {
        int array[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int b[][] = new int[array.length][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                b[i][j] = array[j][i];
            }
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void prog1() {
        int array[] = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }

    public static void prog2() {
        // largest
        int array[] = { 7, 3, 8, 3, 5, 9, 8 };
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
        }
        System.out.print(max);
    }

}
