import java.util.Scanner;

public class simpleInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float p, t, r;
        System.out.print("Enter principle amount:");
        p = sc.nextFloat();
        System.out.print("Enter time period in years:");
        t = sc.nextFloat();
        System.out.print("Enter rate of interest:");
        r = sc.nextFloat();
        float SI;
        SI = (p * t * r) / 100;
        System.out.print("Simple interes is: " + SI);
        sc.close();
    }

}
