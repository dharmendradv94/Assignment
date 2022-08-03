package dk.it.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dk.it.entities.Employee;
@Service
public interface EmployeeService {
	public List<Employee> getEmployee();

	public Optional<Employee> getEmployee(int empId);

	public void deleteEmployee(int empId);

	public Employee updateEmployee(Employee emp);
}
