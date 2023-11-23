package collectionFramework;

public class Demo2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Ganesh", 100000);
        Employee employee2 = new Employee(2, "Abhishek", 100000);
        Employee employee3 = new Employee(3, "Sachin", 100000);
        Employee employee4 = new Employee(4, "Rohit", 100000);
        Employee employee5 = new Employee(5, "Virat", 100000);
        //.....

        Employee[] employees = new Employee[5];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;

        printEmployeeDetails(employees);
    }

    private static void printEmployeeDetails(Employee[] employees) {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

}
