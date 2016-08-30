package com.corejava.examples.clone;

class Employee implements Cloneable{
	 
    private int empoyeeId;
    private String employeeName;
    private Department department;
 
    public Employee(int id, String name, Department dept)
    {
        this.empoyeeId = id;
        this.employeeName = name;
        this.department = dept;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	public int getEmpoyeeId() {
		return empoyeeId;
	}
	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
     
    
}

class Department
{
    private int id;
    private String name;
 
    public Department(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}

public class TestCloning {
	 
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Department dept = new Department(1, "Human Resource");
        Employee original = new Employee(1, "Admin", dept);
        //Lets create a clone of original object
        Employee cloned = (Employee) original.clone();
        //Let verify using employee id, if cloning actually workded
        System.out.println(cloned.getEmpoyeeId());
 
        //Must be true and objects must have different memory addresses
        System.out.println(original != cloned);
 
        //As we are returning same class; so it should be true
        System.out.println(original.getClass() == cloned.getClass());
 
        //Default equals method checks for refernces so it should be false. If we want to make it true,
        //we need to override equals method in Employee class.
        System.out.println(original.equals(cloned));
    }
}