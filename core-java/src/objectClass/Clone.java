package objectClass;

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product product1 = new Product(1, "Mobile", 43000);
        Product product2 = product1;//reference copy
        Product clonedObject = (Product) product1.clone();
        System.out.println(product1 + "\t" + product1.hashCode());


        System.out.println(product2 + "\t" + product2.hashCode());
        System.out.println(clonedObject+ "\t" + clonedObject.hashCode());


    }
}
