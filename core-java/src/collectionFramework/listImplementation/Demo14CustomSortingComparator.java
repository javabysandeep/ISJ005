package collectionFramework.listImplementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo14CustomSortingComparator {
    public static void main(String[] args) {
        Emp emp1 = new Emp(11, "Ganesh", 5490);
        Emp emp2 = new Emp(2, "Abhishek", 67880);
        Emp emp3 = new Emp(32, "Sachin", 100);
        Emp emp4 = new Emp(43, "Rohit", 234000);
        Emp emp5 = new Emp(5, "Virat", 90000);

        List<Emp> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        // Collections.sort(empList, new EmpComparator());
        //Collections.sort(empList, ((e1, e2) -> e1.getEmployeeSalary() - e2.getEmployeeSalary()));
//        Collections.sort(empList, (Comparator.comparingInt(Emp::getEmployeeSalary)));
        Collections.sort(empList, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o1.getEmployeeId() - o2.getEmployeeId();
            }
        });
        empList.forEach(System.out::println);
    }
}
