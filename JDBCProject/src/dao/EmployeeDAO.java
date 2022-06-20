package dao;

import java.util.List;

public interface EmployeeDAO {
	void createEmp(Employee empObj);
	Employee readEmployee(int empNo);
	List<Employee> readAllEmployees();
	boolean updateEmployee (Employee empob);
	boolean deleteEmployee(int empNumber);
	
		
	
	
	


}
