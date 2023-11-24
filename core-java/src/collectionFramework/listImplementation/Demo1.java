package collectionFramework.listImplementation;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        System.out.println(arrayList.size);

        for (Object ob:arrayList.values) {
            System.out.println(ob);
        }
    }
}
