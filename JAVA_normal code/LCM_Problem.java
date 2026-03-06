import java.util.*;

public class LCM_Problem {
    public static void main(String[] args) {
        lcm();
    }

    public static void lcm() {
        Scanner sc = new Scanner(System.in);
        // int n;
        System.out.println("Enter num count: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        int lcm = 1;
        for (int i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            for (int j = 0; j < n / 2; j++) {
                if ((array[j] % min) == 0) {
                    array[j] = (array[j] / min);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            lcm *= array[i];
        }
        System.out.println(lcm);
        sc.close();

    }

}
