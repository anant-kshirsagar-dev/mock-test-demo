package com.demo.dao;

import com.demo.model.Employee;

public interface IEmployeeDao {
	
	public long save(Employee employee);
	
	public boolean delete(Long id);
	
	public void update(Employee employee);
}
