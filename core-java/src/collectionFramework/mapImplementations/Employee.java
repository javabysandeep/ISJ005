package collectionFramework.mapImplementations;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee /*implements Comparable<Employee>*/ {
    private int employeeId;
    private String employeeName;
    private int employeeSalary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }

    /*@Override
    public int compareTo(Employee o) {
        return this.employeeId-o.employeeId;
    }*/
}
