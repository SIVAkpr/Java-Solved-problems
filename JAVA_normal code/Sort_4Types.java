public class Sort_4Types {
    public static void main(String[] args) {
        linearsearch();
        binarysearch();
        bubblesort();
        insertionsort();
        // selectivesort();
        // mergesort();
    }

    public static void insertionsort() {
        int[] a = { 5, 7, 4, 8, 9, 2, 4, 8, 0 };
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int k = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j = j - 1;
            }

            a[j + 1] = k;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void bubblesort() {
        int[] a = { 5, 7, 4, 8, 9, 2, 4, 8, 0 };
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void binarysearch() {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int left, right, key, mid;
        key = 4;
        left = 0;
        right = a.length - 1;
        mid = (a[0] + a[right]) / 2;
        while (left <= right) {
            mid = (a[0] + a[right]) / 2;
            if (a[mid] == key) {
                System.out.print(mid);
                break;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    public static void linearsearch() {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int l = a.length;
        int index = -1;
        int key = 3;
        for (int i = 0; i < l; i++) {
            if (a[i] == key) {
                index = i;
                break;
            }
        }
        if (index < 0) {
            System.out.println("Not found: " + index);
        } else {
            System.out.println(key + " is found at index " + index);
        }
    }

}
