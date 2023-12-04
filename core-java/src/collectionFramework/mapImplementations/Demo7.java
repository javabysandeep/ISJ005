package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo7 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Pune", 12);
        map.put("Mumbai", 19);
        map.put("Delhi", 34);
        map.put("Hyderbad", 45);
        map.put("Chennai", 50);
        map.put("Nashik", 12);

        //1. read entries from the map : traditional for loop
        int size = map.size();
        /*for (int i = 1; i <=size ; i++) {
            System.out.println(map.get());
        }*/

        //2. read entries using for each
        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry);
        }

        //3. read entries using method referene
        map.entrySet().forEach(System.out::println);
    }
}
