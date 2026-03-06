public class addcomplex {
    public static void main(String args[]) {
        String a = "1+6i";
        String b = "1+6i";
        int a_l = left(a);
        int a_r = right(a);
        int b_l = left(b);
        int b_r = right(b);
        int real, image;
        real = a_l + b_l;
        image = a_r + b_r;
        System.out.print(real + " " + "+" + image + "i");
    }

    public static int left(String n) {
        int index = n.indexOf("+");
        int ans = Integer.parseInt(n.substring(0, index));
        return ans;
    }

    public static int right(String n) {
        int index = n.indexOf("+");
        int l = n.length();
        int ans = Integer.parseInt(n.substring(index + 1, l - 1));
        return ans;
    }
}
