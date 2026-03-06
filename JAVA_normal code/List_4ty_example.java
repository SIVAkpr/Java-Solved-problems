import java.util.*;

public class List_4ty_example {
    public static void main(String[] args) {
        create_list();
        compare_list();
        increase();
        replace();
    }

    public static void create_list() {
        List<String> lst1 = new ArrayList<String>();
        lst1.add("Red");
        lst1.add("Blue");
        lst1.add("Orange");
        System.out.println(lst1);
        // iterate print list
        for (String i : lst1) {
            System.out.println(i);
        }
        // insert at first position
        lst1.add(0, "Pink");
        System.out.println();
        System.out.println(lst1);
        // insert at specific index
        int n = 3;
        lst1.add(n, "Green");
        System.out.println("\n" + lst1);
        // review the element by index
        String a = lst1.get(0);
        System.out.println("First element: " + a);
        String b = lst1.get(3);
        System.out.println("Fourth element: " + b);
        // update an element
        String a1 = "Siva";
        lst1.set(1, a1);
        System.out.println("Modified in index 2: " + lst1);
        // remove an element
        lst1.remove(1);
        System.out.println("After removing pos 1" + lst1);
        // search red
        if (lst1.contains("Pink")) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
        // Sort the list
        Collections.sort(lst1);
        System.out.println("Sorted list is: " + lst1);
        // copy list just replaceing by index
        List<String> lst2 = Arrays.asList("Gold", "Silver");
        Collections.copy(lst1, lst2);
        System.out.println("After coppying: " + lst1 + "  " + lst2);
        // Shuffle
        Collections.shuffle(lst1);
        System.out.println(lst1);
        // reverse list
        List<String> lst78 = Arrays.asList("A", "B", "C", "D", "E", "F");
        Collections.reverse(lst78);
        System.out.println("After reversing list" + lst78);
        // extract sublist
        List<String> sub_lst120 = lst78.subList(0, 3);
        System.out.println(sub_lst120);
    }

    public static void compare_list() {
        List<String> lst1 = Arrays.asList("Red", "Green", "Blue", "White", "Orange");
        List<String> lst2 = Arrays.asList("Red", "Green", "Blue", "Orange");
        List<String> c3 = new ArrayList<String>();
        for (String i : lst1) {
            c3.add(lst2.contains(i) ? "Yes" : "No");
        }
        System.out.println(c3);

        // Swap
        Collections.swap(c3, 0, 3);
        System.out.println("After swap" + c3);

        // Join two list
        List<String> lst78 = Arrays.asList("Black", "Brown", "Gold", "Silver");
        List<String> aa = new ArrayList<String>();
        aa.addAll(lst1);
        aa.addAll(lst78);
        System.out.println("List 1: " + lst1 + "\nList 2: " + lst78);
        System.out.println("After joining : " + aa);

        // clone
        aa = lst78;
        System.out.println(lst78);
        ArrayList<String> newc2 = new ArrayList<>(lst1);
        ArrayList<String> newc1 = new ArrayList<>(lst78);
        System.out.println(aa + "\n\t" + newc1 + "\n\t" + newc2);

        // Clear arraylist
        System.out.println();
        List<String> modlst = new ArrayList<>(lst78);
        System.out.println("List78 : " + modlst);
        modlst.removeAll(modlst);
        System.out.println("After removing : " + modlst);
        // check list is enpty or not
        if (modlst.isEmpty()) {
            System.out.println("Given list is empty");
        } else {
            System.out.println("Not empty");
        }
        // trim list
        ArrayList<String> lst = new ArrayList<>(Arrays.asList("Pint", "Red", "Green", "Blue"));
        lst.trimToSize();
        System.out.println(lst);
    }

    public static void increase() {
        ArrayList<String> c1 = new ArrayList<String>(3);
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        System.out.println("Original array list: " + c1);
        c1.ensureCapacity(6); // only increases the internal capacity to avoid resizing during additions; it
                              // does not change the list size.
        System.out.println(c1);
        c1.add(3, "Browm");
        System.out.println(c1);
    }

    public static void replace() {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");
        color.add(1, "Black");
        System.out.println("Original array list: " + color);
        String new_color = "White";
        color.set(1, new_color);
        int num = color.size();
        System.out.println("Replace second element with 'White'.");
        for (int i = 0; i < num; i++)
            System.out.println(i + " " + color.get(i));
    }
}