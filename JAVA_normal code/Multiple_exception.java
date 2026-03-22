public class Multiple_exception {
    public static void main(String[] args) {
        try {
            int data = 25 / 0;
            int[] a = new int[5];
            a[6] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}
