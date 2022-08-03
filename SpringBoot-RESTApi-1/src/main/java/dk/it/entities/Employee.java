package dk.it.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Employee {
	
	@Id
	private int empId;
	private String empName;
	private String empLoc;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Project project;
	
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
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
	
	public Employee(int empId, String empName, String empLoc, Project project) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLoc = empLoc;
		this.project = project;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empLoc=" + empLoc + ", project=" + project
				+ "]";
	}
	
	
	
}
