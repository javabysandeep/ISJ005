package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        //homo,heteor keys
        //unique keys
        //no insertion order
        //null @key only once
        //value = no restrictions
        Map map = new HashMap();
        map.put(100, "abc");
        map.put(null, "null");
        map.put(null, null);
        map.put("abc", null);
        map.put("abc", null);
        map.put(100, "pqr");
        map.put(100, "mnp");
        System.out.println("Size of map " + map.size());//3
        System.out.println(map);
    }
}
