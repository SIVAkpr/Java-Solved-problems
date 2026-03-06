public class reverse {
    public static void main(String[] args) {
        String a = "Siva";
        char[] b = a.toCharArray();
        char[] c = new char[a.length() + 1];
        int q = a.length();
        for (char i : b) {
            c[q] = i;
            q = q - 1;
        }
        System.out.println(c);
    }
}