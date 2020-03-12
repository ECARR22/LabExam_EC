package ie.gmit;

import java.util.ArrayList;

public class EmployeeList {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public EmployeeList(ArrayList employeeList){
        if(employeeList.isEmpty()) {
            Employee e1 = new Employee("Evans", "12345");
            Employee e2 = new Employee("ruari", "24681");
            employeeList.add(e1);
            employeeList.add(e2);
        }
        else if(employeeList.equals(employeeList)) {
            throw new IllegalArgumentException("Duplicate Employee details found, no object added\n");
        }
        else{
            employeeList.add(new Employee("", ""));
        }
/*
       for ( employeeList : ArrayList<Employee> {

        }*/
    }
    /*
    public AddEmployee() {
        employeeList.add(new Employee("", ""));
        return Employee;
    }
    /*
    public deleteEmployee() {
        if ( new Employee("", "") );
    }*/

    //




}


