package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo6 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Pune", 12);
        map.put("Mumbai", 19);
        map.put("Delhi", 34);
        map.put("Hyderbad", 45);
        map.put("Chennai", 50);
        map.put("Nashik", 12);
        //1. projection : get only keys
        System.out.println("only keys " + map.keySet());

        //2. projection : get only values
        System.out.println("only values " + map.values());

        //3. Projection get all entries
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            // System.out.println(entry);
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}
