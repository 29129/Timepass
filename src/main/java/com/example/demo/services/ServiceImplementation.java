package com.example.demo.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DaoImplementation;
import com.example.demo.dao.DaoInterface;
import com.example.demo.model.Employee;

@Service
public class ServiceImplementation implements ServiceInterface {

	@Autowired
	DaoInterface d;

	@Override
	public void addemployee(Employee emp) {

		d.addemployee(emp);

	}

	@Override
	/*
	 * public List<Employee> login(Employee emp) { // TODO Auto-generated method
	 * stub return null; }
	 */

	public List<Employee> login(Employee emp) {

		
		List<Employee> ll = d.login(emp);
		Iterator itr = ll.iterator();
		while (itr.hasNext()) {
			Employee emp1 = (Employee) itr.next();

			if (emp1.getUsername().equals(emp.getUsername()) && emp1.getPass().equals(emp.getPass())) {

				return ll;
			}
		}
		return d.login(emp);

	}

	@Override
	public List<Employee> showList() {

		return d.showList();

	}

	@Override
	public Employee editEmployee(int id) {
		// TODO Auto-generated method stub
		return d.editEmployee(id);
	}

	@Override
	public void updateEmployee(Employee emp) {

		d.updateEmployee(emp);
	}

	@Override
	public int deleteEmployee(int id) {

		d.deleteEmployee(id);
		// TODO Auto-generated method stub
		return 1;
	}

}
