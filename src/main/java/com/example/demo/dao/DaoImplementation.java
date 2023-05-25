package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Repository
@Transactional
public class DaoImplementation implements DaoInterface {

	@Autowired
	EntityManager entitymanager;

	@Override
	public void addemployee(Employee emp) {
		entitymanager.persist(emp);

	}

	@Override
	public List<Employee> login(Employee emp) {
		Query query = (Query) entitymanager.createQuery("from Employee where username=? and pass=?");
		query.setParameter(0, emp.getUsername());
		query.setParameter(1, emp.getPass());
		List<Employee> list = query.getResultList();
		return list;

	}

	@Override
	public List<Employee> showList() {

		Query query = (Query) entitymanager.createQuery("from Employee");
		List<Employee> list = query.getResultList();
		System.out.println(list);
		return list;

	}

	@Override
	public Employee editEmployee(int id) {

		Employee emp=entitymanager.find(Employee.class, id);
		return emp;

	}

	@Override
	public void updateEmployee(Employee emp)
	{
	
		Employee emp1=entitymanager.find(Employee.class,emp.getId());
		emp1.setName(emp.getName());
		emp1.setAddress(emp.getAddress());
		emp1.setEmail(emp.getEmail());
		emp1.setMob(emp.getMob());
		emp1.setUsername(emp.getUsername());
		emp1.setPass(emp.getPass());
		System.out.println(emp1.getUsername());
		entitymanager.flush();

	}

	@Override
	public int deleteEmployee(int id) {

	
		Employee emp1=entitymanager.find(Employee.class,id);
		entitymanager.remove(emp1);
		return id;


	}

}
