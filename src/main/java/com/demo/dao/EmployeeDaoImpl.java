package com.demo.dao;

import com.demo.model.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {
	
	public long save(Employee employee) {
		System.out.println("Saving employee to database: " +employee.getId());
		return employee.getId();
	}

	public boolean delete(Long id) {
		System.out.println("Deleting employee record from database with id: " +id);
		return true;
	}

	public void update(Employee employee) {
		System.out.println("Updation success: " +employee.getId());		
	}
}
