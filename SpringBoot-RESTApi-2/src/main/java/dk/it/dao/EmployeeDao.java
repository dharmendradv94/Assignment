package dk.it.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dk.it.entities.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer>{
	
}
