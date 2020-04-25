package com.patterns.pojo;
/**
 * Singleton class of Employee.
 * 
 * @author Nishant
 */
public class Employee extends Shopper {

	protected boolean employed;
	protected String empName;

	private static Employee employee;

	private Employee() {
		System.out.println("Creating New Instance");
	}

	private Employee(String name, String money, String employer) {
		super(name, money);
		System.out.println("Creating New Instance");
		this.employed = true;
		this.empName = employer;
	}

	public boolean isEmployed() {
		return employed;
	}

	public void setEmployed(boolean employed) {
		this.employed = employed;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getMoney() {
		return this.money;
	}

	public String getName() {
		return this.name;
	}

	public static Employee createSingletonInstance(String name, String money, String employer) {
		System.out.println("Requesting for the Instance");
		if (employee != null) {
			System.out.println("Instance is already created!! Returning the old instance!!");
		}
		if (employee == null) {
			employee = new Employee(name, money, employer);
		}
		return employee;
	}

	@Override
	public String toString() {
		return "Employee [employed=" + employed + ", empName=" + empName + ", money=" + money + "]";
	}

}
