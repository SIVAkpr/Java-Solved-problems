import java.util.*;

class Tcsdirection {
    public static void main(String[] args) {
        direction();
        vehicle();
        countspch();
        countprior();
        matrix();
        gcd();
        perfectnum();
        allcharfreq();
        bin2dec();
        dec2hex();
    }

    public static void dec2hex() {
        System.out.print("Enter a dec num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int org = num;
        String hex = "";
        while (num != 0) {
            int a = num % 16;
            if (a < 10) {
                hex = hex + a;
            } else {
                int num1 = 55 + a;
                char ascii = (char) num1;
                hex += ascii;
            }
            num = num / 16;
        }
        String hex1 = new StringBuilder(hex).reverse().toString();
        System.out.println(org + " = " + hex1);
        sc.close();
    }

    public static void bin2dec() {
        System.out.println("Enter a bin num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int org = num;
        int a;
        int dec = 0, i = 0;
        while (num != 0) {
            a = num % 10;
            if (a == 1) {
                int x = (int) Math.pow(2, i);
                dec += x;
                i++;
            } else {
                i++;
            }
            num = num / 10;
        }
        System.out.println(org + " = " + dec);
        sc.close();
    }

    public static void allcharfreq() {
        String str = "sivabalan";
        char[] arr = str.toCharArray();
        int[] freq = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = '0';
                }
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if ((arr[i] != ' ') && (arr[i] != '0')) {
                System.out.println(arr[i] + " = " + freq[i]);
            }
        }
    }

    public static void perfectnum() {
        int x = 28;
        // ArrayList<Integer> lst = new ArrayList<>();
        int pernum = 0;
        for (int i = 1; i <= (x / 2); i++) {
            if ((x % i) == 0) {
                pernum += i;
            }
        }
        if (x == pernum) {
            System.out.println(x + " is a perfect number");
        } else {
            System.out.println(x + " Is not a perfect number");
        }
    }

    public static void gcd() {
        int x = 36;
        int y = 60;
        int z;
        while (x > 0) {
            if (x <= y) {
                int temp = y;
                y = x;
                x = temp;
            }
            x = x - y;
        }
        z = y;
        System.out.println(z);
    }

    public static void matrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows ");
        int row = sc.nextInt();
        System.out.print("no. of col ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0, index = 0;
        for (int i = 0; i < row; i++) {
            int count = 0;
            for (int j = 0; j < col; j++) {
                count += arr[i][j];
            }
            if (max < count) {
                max = count;
                index = i + 1;
            }
        }
        System.out.println("Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Max row is " + index);
        sc.close();

    }

    public static void countprior() {
        // int[] arr = { 7, 3, 8, 9, 2 };
        int[] arr = { 3, 4, 5, 8, 9 };
        int count = 1;
        int pr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (pr < arr[i]) {
                count += 1;
            }
        }
        System.out.println(count);

    }

    public static void countspch() {
        String str = "###******";
        int hash = 0;
        int star = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                hash += 1;
            } else if (str.charAt(i) == '*') {
                star += 1;
            }
        }
        System.out.println(star - hash);
    }

    public static void vehicle() {
        int v = 200;
        int w = 540;
        int tw = 0;
        int fw = 0;
        if ((v < w) && (w % 2 == 0) && (w >= 2)) {
            fw = (w - (2 * v)) / 2;
            tw = v - fw;
        } else {
            System.out.println("INVALID OUTPUT");
        }
        System.out.println(fw + " " + tw);
    }

    public static void direction() {
        int x = 0;
        int y = 0;
        int n = 5;
        int d = 0;
        for (int i = 1; i <= n; i++) {
            d = i * 10;
            int num = i % 4;
            if (num == 1) {
                x += d;
            } else if (num == 2) {
                y += d;
            } else if (num == 3) {
                x -= d;
            } else {
                y -= d;
            }
        }
        System.out.println(x + " " + y);
    }
}