package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Employee;

public interface ServiceInterface {

	public void addemployee(Employee emp);
	public List<Employee> login(Employee emp);
	public List<Employee> showList();
	public Employee editEmployee(int id);
	public void updateEmployee(Employee emp);
	public int deleteEmployee(int id);
}
