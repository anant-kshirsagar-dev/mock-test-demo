package com.demo.app;

import com.demo.dao.EmployeeDaoImpl;
import com.demo.dao.IEmployeeDao;
import com.demo.model.Employee;

public class EmployeeApp {
	
	public static void main(String[] args) {
		Employee e = getNewEmployee();
		IEmployeeDao empDao = new EmployeeDaoImpl();
		empDao.save(e);
	}
	
	private static Employee getNewEmployee() {
		return new Employee(101L, "Anant", "Software Developer");
	}
}
