package oops.encapsulation;

public class Demo1 {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "abc", 27, 16000);
        //employee.employeeAge = -25;
        //System.out.println(employee.employeeAge);

        employee.setEmployeeAge(-20);
        System.out.println(employee.getEmployeeAge());
    }
}
