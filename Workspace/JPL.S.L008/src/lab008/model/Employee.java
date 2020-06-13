package lab008.model;

import java.io.Serializable;

public class Employee implements Serializable {
	private String id;
	private String employeeName;
	private String phone;
	private String age;
	private Double salary;

	public Employee() {

	}
	

	public Employee(String employeeName, String phone, String age) {
		super();
		this.employeeName = employeeName;
		this.phone = phone;
		this.age = age;
	}


	public Employee(String id, String employeeName, String phone, String age, Double salary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.phone = phone;
		this.age = age;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", phone=" + phone + ", age=" + age
				+ ", salary=" + salary + "]";
	}
	
	

}
