import java.util.Arrays;

public class string {
    public static void main(String[] arg) {
        // palindrome();
        // anagram();
        // anagram2();
         reverse();
       // removeleadingzeros();
    }

    public static void removeleadingzeros() {
        String a = "00001234";
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '0') {
                b = b + a.charAt(i);
            }
        }
        System.out.println(": " + b);

    }

    public static void reverse() {
        String a = "Sivabalan";
        String b = "";
        int l = a.length();
        for (int i = 0; i < a.length(); i++) {
            b = b + a.charAt(l - i - 1);
        }
        System.out.println(b);
    }

    public static void anagram2() {
        String a = "silent";
        String b = "listen";

        if (a.length() != b.length()) {
            System.out.println("Given strings are not anagrams");
            return;
        }

        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        if (Arrays.equals(arrA, arrB)) {
            System.out.println("Given strings are anagrams");
        } else {
            System.out.println("Given strings are not anagrams");
        }
    }

    public static void anagram() {
        String a = "silent";
        String b = "listen";
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < a.length(); i++) {
            int unicodeValue = a.charAt(i);
            sum1 = sum1 + unicodeValue;
        }
        for (int i = 0; i < a.length(); i++) {
            int unicodeValue = b.charAt(i);
            sum2 = sum2 + unicodeValue;
        }
        if (sum1 == sum2) {
            System.out.println("Given string is anagram");
        } else {
            System.out.println("Given string is not an anagram");
        }
    }

    public static void palindrome() {
        String a = "racecar";
        String b = "";
        int index = a.length();
        for (int i = index - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        // System.out.println(b);

        if (a.equals(b)) {// a.equals(b)
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
