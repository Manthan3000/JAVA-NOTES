import java.util.*;

public class hashmap {

    public static void main(String[] args) {
        // Country(key) , Population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // 1. Insertion Operation

        map.put("India", 120);
        map.put("China", 150);
        map.put("US", 20);

        System.out.println(map);

        map.put("China", 130);
        System.out.println(map);

        // 2 .Search Operation , Loockup operation

        if (map.containsKey("China")) {
            System.out.println("key is Present in Map");
        } else {
            System.out.println("Absent");
        }

        System.out.println(map.get("China"));// key exist 130
        System.out.println(map.get("Indonesia"));// key doesnot exist

        int arr[] = { 12, 15, 18 };

        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // 12 15 18

        // loop another methode
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        // 12 15 18

        // 3 . Traversing in Hashmap
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // 4. Removel methode
        map.remove("China");
        System.out.println(map);
    }
}
