
//Implement a program to display the sum of two given numbers if the numbers are same.
// If the numbers are not same, display the double of the sum.
import java.util.Scanner;

public class Exp1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        int a = 5;
        int b = 5;
        if (a == b) {
            System.out.println("Sum is: " + (a + b));
        } else {
            System.out.println("Sum double is: " + (a + b) * 2);
        }
        // sc.close();
        luckyno();
        // roundoff();
        // exp();
        // food();
        // sum();
        // specialmove();
        // notes();
        // palin();
        // seed();

    }

    public static void luckyno() {
        // lucky num if 1623 = even pos square 6^2 +3^2 =45 is a multiple oof 9 is lucky
        // num.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        long num = sc.nextLong();
        // long num = 9944778107;
        int sum = 0;
        int len = String.valueOf(num).length();
        String str = Long.toString(num);
        for (int i = 0; i < len; i++) {
            if (((i + 1) % 2) == 0) {
                int n = Character.getNumericValue(str.charAt(i));
                // System.out.println(str.charAt(i));
                sum = sum + (int) Math.pow(n, 2);
            }
        }
        if ((sum % 9) == 0) {
            System.out.println(num + " is lucky number");
        } else {
            System.out.println(num + " is NOT a lucky number");
        }
        // System.out.println(len);
        sc.close();
    }

    public static void roundoff() {
        double num1 = 65, num2 = 175;
        double num3 = num1 / num2;
        System.out.println(Math.round(num3 * 100.0) / 100.0);
    }

    public static void exp() {
        int a = 12;
        int b = 8;
        int c = 15;
        double avg = (a + b + c) / 3.0;
        // System.out.println(avg);
        System.out.println((double) Math.round(avg * 100.0) / 100.0);
    }

    public static void food() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter food type( V / N ): ");
        String type = sc.next();
        // String type = "V";
        System.out.print("\nEnter quantity(min 1): ");
        int quan = sc.nextInt();
        System.out.print("\n distance of travel(in km): ");
        int dist = sc.nextInt();
        int cst = 0;
        int res = -1;
        if (dist >= 3) {
            dist = dist - 3;
            cst = 0;
            dist = dist - 3;
            if (dist >= 0) {
                cst = 1;
            }
            if (dist > 0) {
                cst = cst + 2;
            }
        } else {
            dist = 0;
            cst = 0;
        }

        if (type == "V") {
            res = (12 * quan) * cst;
        } else {
            res = (15 * quan) + cst;
        }
        if ((quan >= 1) && (dist >= 0) && ((type == "V") || (type == "N"))) {
            System.out.println("RESULT: " + res);
        } else {
            res = -1;
            System.out.println("RESULT: " + res);
        }
        sc.close();
    }

    public static void sum() {
        int[] numbers = { 68, 79, 86, 99, 23, 2, 41, 100 };
        int sum = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] % 2 == 0) {
                sum = sum + numbers[i];
            }
        }
        System.out.println("Sum is: " + sum);
    }

    public static void specialmove() {
        String str = "He@#$ll0!*&";
        // int len = str.length();
        String a = "";
        String b = "";
        // String regex = "[a-zA-Z0-9\\s+]";
        for (char i : str.toCharArray()) {
            if (Character.isLetterOrDigit(i)) {
                a = a + i;
            } else {
                b = b + i;
            }
        }
        String c = a + b;
        System.out.println("Ans: " + c);
    }

    public static void notes() {
        int rs1 = 3;
        int rs5 = 3;
        int pamt = 19;
        int res = -1;
        int cnt1 = 0;
        int cnt5 = 0;
        while (rs5 != 0) {
            pamt = pamt - 5;
            rs5 = rs5 - 1;
            cnt5 = cnt5 + 1;
            if (pamt == 0) {
                res = -1;
                break;
            }
        }
        while (rs1 != 0) {
            if (pamt == 0) {
                res = -1;
                break;
            }
            pamt = pamt - 1;
            rs1 = rs1 - 1;
            cnt1 = cnt1 + 1;
        }
        if (pamt != 0) {
            System.out.println("No change: " + res);
        } else {
            System.out.println("$1 notes needed: " + cnt1);
            System.out.println("$5 notes needed: " + cnt5);
        }
    }

    public static void palin() {
        int a = 1331;
        int b = a;
        int n;
        int s = 0;
        while (a != 0) {
            n = a % 10;
            s = (s * 10) + n;
            a = a / 10;
        }
        if (b == s) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void seed() {
        // 123 is seed of 738, if 123*1*2*3=738
        int x = 123;
        int y = 738;
        int ans = x;
        int x1 = x;
        int len = String.valueOf(x).length();
        for (int i = 1; i <= len; i++) {
            ans = ans * (x % 10);
            x = x / 10;
        }
        if (ans == y) {
            System.out.println(x1 + " is the seed of " + y);
        } else {
            System.out.println(x1 + " is not the seed of " + y);
        }

    }
}
