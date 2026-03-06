//Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation.
// If 7 is the last integer, then display -1.
public class Exp3 {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int c = 9;
        int result = 0;
        if (a == 7) {
            result = b * c;
        } else if (b == 7) {
            result = c;
        } else if (c == 7) {
            result = -1;
        } else {
            result = a * b * c;
        }
        System.out.println("The product is: " + result);
    }
}
