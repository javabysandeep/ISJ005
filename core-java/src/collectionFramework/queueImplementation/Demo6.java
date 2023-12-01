package collectionFramework.queueImplementation;

import collectionFramework.setImplementations.Employee;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class Demo6 {
    public static void main(String[] args) {
        Comparator<Employee> comparator = (emp1, emp2) -> emp2.getEmployeeSalary() - emp1.getEmployeeSalary();
        Queue<Employee> queue = new PriorityQueue<>(comparator);

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

        queue.add(employee1);
        queue.add(employee2);
        queue.add(employee3);
        queue.add(employee4);
        queue.add(employee5);
        queue.add(employee6);
        queue.add(employee7);
        queue.add(employee8);
        queue.add(employee9);
        queue.add(employee10);

        int size = queue.size();
        for (int i = 1; i <= size; i++) {
            System.out.println(queue.poll());
        }
    }
}
