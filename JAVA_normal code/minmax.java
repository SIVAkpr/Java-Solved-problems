public class minmax {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 6, 5, 11, 7, 8, 9, 10 };
        int min = a[1];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(min + " " + max);
    }

}
