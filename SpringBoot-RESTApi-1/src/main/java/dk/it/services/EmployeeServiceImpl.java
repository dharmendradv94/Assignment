package dk.it.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dk.it.dao.EmployeeDao;
import dk.it.entities.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao empDao;
	
	@Override
	public List<Employee> getEmployee() {
		
		return empDao.findAll();
	}
public String getauthtoken() {
		
		return "dcbe9ubecbsebvusewe";
	}

	@Override
	public Optional<Employee> getEmployee(int empId) {
		
		return empDao.findById(empId);
	}

	@Override
	public void deleteEmployee(int empId) {
		empDao.deleteById(empId);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		empDao.save(emp);
		return emp;
	}

}
