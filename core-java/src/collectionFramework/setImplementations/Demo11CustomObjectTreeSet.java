package collectionFramework.setImplementations;

import java.util.TreeSet;

public class Demo11CustomObjectTreeSet {
    public static void main(String[] args) {
        //in this employees will be sorted using COmparable
        TreeSet<Employee> employees = new TreeSet<>();

        Employee employee1 = new Employee(11, "Ganesh", 5490);
        Employee employee2 = new Employee(11, "Ganesh", 5490);
        Employee employee3 = new Employee(2, "Abhishek", 67880);
        Employee employee4 = new Employee(2, "Abhishek", 67880);
        Employee employee5 = new Employee(32, "Sachin", 100);
        Employee employee6 = new Employee(32, "Sachin", 100);
        Employee employee7 = new Employee(43, "Rohit", 234000);
        Employee employee8 = new Employee(43, "Rohit", 234000);
        Employee employee9 = new Employee(5, "Virat", 90000);
        Employee employee10 = new Employee(5, "Virat", 90000);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        employees.add(employee10);

        employees.forEach(System.out::println);

    }
}
