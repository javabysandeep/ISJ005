package com.itshaala;

import com.itshaala.dao.EmployeeDao;
import com.itshaala.model.ContractEmployee;
import com.itshaala.model.Employee;
import com.itshaala.model.FullTimeEmployee;

public class EmployeeApp {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDao();

        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setEmployeeName("Omkar");
        contractEmployee.setInvoiceAmount(19090);
        employeeDao.addEmployee(contractEmployee);

        FullTimeEmployee fte = new FullTimeEmployee();
        fte.setEmployeeName("Ganesh");
        fte.setSalary(190000);
        employeeDao.addEmployee(fte);

      /*  Employee employee = new Employee(11,"Sandeep");
        employeeDao.addEmployee(employee);*/

        /*Employee employee = employeeDao.getEmployee(2);
        System.out.println(employee);*/
    }
}
