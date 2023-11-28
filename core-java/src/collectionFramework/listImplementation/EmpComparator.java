package collectionFramework.listImplementation;

import java.util.Comparator;

public class EmpComparator implements Comparator<Emp> {
    @Override
    public int compare(Emp emp1, Emp emp2) {
        return emp1.getEmployeeId() - emp2.getEmployeeId();
    }
}
