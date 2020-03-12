package ie.gmit;

public class Employee {

    private String name;
    private String employeeID;

    public Employee(String name, String employeeID) {
        if(name.length() < 5) {
            throw new IllegalArgumentException("Name must be 5 characters minimum\n");
        }
        else if(employeeID.length() < 5 || employeeID.length() > 5) {
            throw new IllegalArgumentException("Employee number must be 5 characters minimum\n");
        }
        else {
            this.name = name;
            this.employeeID = employeeID;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }


}
