package dk.it.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dk.it.entities.Employee;
import dk.it.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmpController {
	@Autowired
	private EmployeeService empService;
	
	//get employees details
	@GetMapping("/emp")
	public List<Employee> getEmployee() {
		
		return this.empService.getEmployee();
	}
	
	//get employee details by id
	@GetMapping("/emp/{empId}")
	public Optional<Employee> getEmp(@PathVariable Integer empId) {
		
		return this.empService.getEmployee(empId);
	}
	
	// Add Employee
		@PostMapping("/emp")
		public Employee addEmp(@RequestBody Employee emp) {
			return this.empService.updateEmployee(emp);
		}
		
	//delete employee
		@DeleteMapping("emp/{empId}")
		public ResponseEntity<Employee> deleteEmp(@PathVariable Integer empId) {
			try {
				this.empService.deleteEmployee(empId);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
	//updating employee
		@PutMapping("/empupdate")
		public Employee updateEmp(@RequestBody Employee emp) {
			
			return this.empService.updateEmployee(emp);
		}
		
}
