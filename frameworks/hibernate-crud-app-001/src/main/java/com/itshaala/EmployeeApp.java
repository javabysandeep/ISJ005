package com.itshaala;

import com.itshaala.dao.EmployeeDao;
import com.itshaala.model.Employee;

public class EmployeeApp {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.addEmployee(Employee.builder()
                .employeeName("Ganesh")
                .build());
    }
}
