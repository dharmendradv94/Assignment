package dk.it.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
	
	@Id
	private int empId;
	private String empName;
	private String empLoc;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpLoc() {
		return empLoc;
	}
	public void setEmpLoc(String empLoc) {
		this.empLoc = empLoc;
	}
	
	public Employee(int empId, String empName, String empLoc) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLoc = empLoc;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empLoc=" + empLoc + "]";
	}
	
	
	
	
}
