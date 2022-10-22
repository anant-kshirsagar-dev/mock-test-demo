package com.demo.service;

import com.demo.dao.IEmployeeDao;
import com.demo.model.Employee;

public class EmployeeService {
	
	private final IEmployeeDao employeeDao;
	
	public EmployeeService(IEmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public long save(Employee employee) {
		return employeeDao.save(employee);
	}
	
	public boolean delete(Long id) {
		return employeeDao.delete(id);
	}
	
	public void update(Employee employee) {
		employeeDao.update(employee);
	}
}
