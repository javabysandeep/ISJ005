package collectionFramework.listImplementation;

public class Demo1 {
    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList();
        customArrayList.add(10);
        customArrayList.add(10);
        customArrayList.add(10);
        customArrayList.add(10);
        customArrayList.add(10);
        customArrayList.add(10);
        customArrayList.add(10);
        customArrayList.add(10);
        System.out.println(customArrayList.size);

        for (Object ob: customArrayList.values) {
            System.out.println(ob);
        }
    }
}
