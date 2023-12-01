package collectionFramework.setImplementations;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo12CustomObjectTreeSetSortingComparator {
    public static void main(String[] args) {
        //in this employees will be sorted using Comparator
//        Comparator<Employee> comparator =  (o1, o2)->o1.getEmployeeId()- o2.getEmployeeId();
        Comparator<Employee> comparator = Comparator.comparingInt(Employee::getEmployeeSalary);
        TreeSet<Employee> employees = new TreeSet<>(comparator);

        Employee employee1 = new Employee(11, "Ganesh", 5490);
        Employee employee2 = new Employee(11, "Ganesh", 5490);
        Employee employee3 = new Employee(2, "Abhishek", 67880);
        Employee employee4 = new Employee(2, "Abhishek", 67880);
        Employee employee5 = new Employee(320, "Sachin", 100);
        Employee employee6 = new Employee(320, "Sachin", 100);
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
