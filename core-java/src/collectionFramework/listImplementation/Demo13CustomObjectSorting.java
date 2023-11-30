package collectionFramework.listImplementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo13CustomObjectSorting {
    public static void main(String[] args) {
        Employee employee1 = new Employee(11, "Ganesh", 5490);
        Employee employee2 = new Employee(2, "Abhishek", 67880);
        Employee employee3 = new Employee(32, "Sachin", 100);
        Employee employee4 = new Employee(43, "Rohit", 234000);
        Employee employee5 = new Employee(5, "Virat", 90000);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        Collections.sort(employeeList);


        employeeList.forEach(System.out::println);
    }
}
