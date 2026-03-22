class Exeption {
    public static void main(String[] args) {
        ArithmeticException();
        ArithmeticException_2();
        NullPointerException();
        NumberFormatException();
        ArrayIndexOutOfBoundsException();
    }

    public static void ArithmeticException() {
        try {
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.print(e);
        }
        System.out.println("rest of the code 1");
    }

    public static void ArithmeticException_2() {
        try {
            int data = 100 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void NullPointerException() {
        try {
            String s = null;
            int l = s.length();
            System.out.println(l);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("Rest of code 2");
    }

    public static void NumberFormatException() {
        String s = "siva";
        try {
            int i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println("rest 3");
    }

    public static void ArrayIndexOutOfBoundsException() {
        int[] a = new int[10];
        try {
            a[11] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Final block execute always");
        }
    }
}