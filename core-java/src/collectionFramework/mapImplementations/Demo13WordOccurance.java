package collectionFramework.mapImplementations;

import java.util.HashMap;

public class Demo13WordOccurance {
    public static void main(String[] args) {
        String str = "welcome to the collection framework session and the Spring framework session";
        String[] words = str.trim().split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
            if (hashMap.containsKey(word)) {
                hashMap.put(word, hashMap.get(word) + 1);
            } else {
                hashMap.put(word, 1);
            }
        }
        System.out.println(hashMap);
    }
}
