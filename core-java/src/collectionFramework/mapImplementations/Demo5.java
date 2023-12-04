package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;

public class Demo5 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(100, "abc");
        map.put(null, "null");
        map.put(null, null);
        map.put("abc", null);
        map.put("abc", null);
        map.put(100, "pqr");
        map.put(100, "mnp");
        System.out.println("key search " + map.containsKey(100));
        System.out.println("Value search " + map.containsValue("mnp"));
        System.out.println("is empty "+map.isEmpty());
        map.clear();
        System.out.println(map);
    }
}
