package com.demo.test.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.demo.dao.IEmployeeDao;
import com.demo.model.Employee;
import com.demo.service.EmployeeService;

public class EmployeeServiceTest {
	
	@Test
	public void saveEmployee() {
		Employee e = getEmployee();
		IEmployeeDao empDao = Mockito.mock(IEmployeeDao.class);
		Mockito.when(empDao.save(e)).thenReturn(102L);
		
		EmployeeService empService = new EmployeeService(empDao);
		long id = empService.save(e);
		Assert.assertEquals(102L, id);
	}
	
	@Test
	public void deleteEmployee() {
		IEmployeeDao empDao = Mockito.mock(IEmployeeDao.class);
		Mockito.when(empDao.delete(1001L)).thenReturn(true);
		
		EmployeeService empService = new EmployeeService(empDao);
		boolean result = empService.delete(1001L);
		
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void updateEmployee() {
		Employee e = getEmployee();
		IEmployeeDao empDao = Mockito.mock(IEmployeeDao.class);
		Mockito.doNothing().when(empDao).update(e);
		
		EmployeeService empService = mock(EmployeeService.class);
		empService.update(e);
		
		verify(empService, Mockito.times(1)).update(e);
	}
	
	private Employee getEmployee() {
		return new Employee(102L, "Ashish", "Java Developer");
	}
}
