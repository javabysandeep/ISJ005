package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;

public class Demo3CharacterOccurance {
    public static void main(String[] args) {
        String str = "welcome to the collection framework session";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) + 1);
            } else {
                hashMap.put(ch, 1);
            }
        }
        System.out.println(hashMap);
    }
}
