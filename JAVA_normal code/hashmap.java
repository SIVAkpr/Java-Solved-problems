import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, String> num = new HashMap<String, String>();
        num.put("England", "London");
        num.put("India", "New Dehli");
        num.put("Austria", "Wien");
        num.put("Norway", "Oslo");
        num.put("Norway", "Oslo");
        num.put("USA", "Washington DC");
        System.out.println(num);

        String a = num.get("England");
        System.out.println(a);

        int len = num.size();
        System.out.println(len);

        num.remove("England");
        System.out.println(num);

        for (String i : num.keySet()) {
            System.out.println(i);
        }
        System.out.println();
        for (String i : num.values()) {
            System.out.println(i);
        }
        System.out.println();
        // Print keys and values
        for (String i : num.keySet()) {
            System.out.println("key: " + i + " value: " + num.get(i));
        }

        num.clear();
        System.out.println(num);
    }

}
