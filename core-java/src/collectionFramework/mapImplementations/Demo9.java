package collectionFramework.mapImplementations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo9 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Pune", 12);
        map.put("Mumbai", 19);
        map.put("Delhi", 34);
        map.put("Hyderbad", 45);
        map.put("Chennai", 50);
        map.put("Nashik", 12);

        //3. read entries using method reference
        map.entrySet().forEach(System.out::println);
    }
}
