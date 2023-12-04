package collectionFramework.mapImplementations;


import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Demo12CustomObjects {
    public static void main(String[] args) {
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

        Map<Employee, Integer> map = new TreeMap<>(Comparator.comparingInt(Employee::getEmployeeSalary));

        map.put(employee1, 29);
        map.put(employee2, 19);
        map.put(employee3, 9);
        map.put(employee4, 2);
        map.put(employee5, 4);
        map.put(employee6, 5);
        map.put(employee7, 40);
        map.put(employee8, 78);
        map.put(employee9, 90);
        map.put(employee10, 8);

        map.entrySet().forEach(System.out::println);

    }
}
