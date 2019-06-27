package com.markrai.departments.test;

import java.util.ArrayList;
import java.util.List;

import com.markrai.departments.configuration.Config;
import com.markrai.departments.entity.Department;
import com.markrai.departments.entity.Employee;
import com.markrai.departments.manager.EmployeeManager;

public class TestData {

	static List<com.markrai.departments.entity.Employee> employeeList = new ArrayList<Employee>();
	static List<Employee> listOfSubordinates = new ArrayList<Employee>();

	public static List<Employee> createTestData() throws Exception {

		// Create Departments

		Department d1 = new Department();
		d1.setName("ACCOUNTING");
		Department d2 = new Department();
		d2.setName("MARKETING");

		// Create Managers

		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Marge");
		e1.setType(Config.MGR);
		e1.setAllocation(Config.MANAGER_ALLOCATION);
		e1.setDepartment(Config.ACCOUNTING);

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("Mike");
		e2.setType(Config.MGR);
		e2.setAllocation(Config.MANAGER_ALLOCATION);
		e2.setDepartment(Config.MARKETING);

		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("Mack");
		e3.setType(Config.MGR);
		e3.setAllocation(Config.MANAGER_ALLOCATION);
		e3.setDepartment(Config.ACCOUNTING);

		Employee e4 = new Employee();
		e4.setId(4);
		e4.setName("Milton");
		e4.setType(Config.MGR);
		e4.setAllocation(Config.MANAGER_ALLOCATION);
		e4.setDepartment(Config.MARKETING);

		// Create Developers

		Employee e5 = new Employee();
		e5.setId(5);
		e5.setName("Dave");
		e5.setType(Config.DEV);
		e5.setAllocation(Config.DEVELOPER_ALLOCATION);
		e5.setDepartment(Config.ACCOUNTING);

		Employee e6 = new Employee();
		e6.setId(6);
		e6.setName("Dan");
		e6.setType(Config.DEV);
		e6.setAllocation(Config.DEVELOPER_ALLOCATION);
		e6.setDepartment(Config.MARKETING);

		Employee e7 = new Employee();
		e7.setId(7);
		e7.setName("Dolly");
		e7.setType(Config.DEV);
		e7.setAllocation(Config.DEVELOPER_ALLOCATION);
		e7.setDepartment(Config.ACCOUNTING);

		Employee e8 = new Employee();
		e8.setId(8);
		e8.setName("Denise");
		e8.setType(Config.DEV);
		e8.setAllocation(Config.DEVELOPER_ALLOCATION);
		e8.setDepartment(Config.MARKETING);

		// Create QA Testers

		Employee e9 = new Employee();
		e9.setId(9);
		e9.setName("Timmy");
		e9.setType(Config.QA);
		e9.setAllocation(Config.QATESTER_ALLOCATION);
		e9.setDepartment(Config.ACCOUNTING);

		Employee e10 = new Employee();
		e10.setId(10);
		e10.setName("Tony");
		e10.setType(Config.QA);
		e10.setAllocation(Config.QATESTER_ALLOCATION);
		e10.setDepartment(Config.MARKETING);

		Employee e11 = new Employee();
		e11.setId(11);
		e11.setName("Tina");
		e11.setType(Config.QA);
		e11.setAllocation(Config.QATESTER_ALLOCATION);
		e11.setDepartment(Config.ACCOUNTING);

		Employee e12 = new Employee();
		e12.setId(12);
		e12.setName("Tyrion");
		e12.setType(Config.QA);
		e12.setAllocation(Config.QATESTER_ALLOCATION);
		e12.setDepartment(Config.MARKETING);

		// Create subordinate relationships
		e1.setReportingManager(e3);
		e2.setReportingManager(e4);
		e5.setReportingManager(e3);
		e6.setReportingManager(e4);
		e7.setReportingManager(e3);
		e8.setReportingManager(e4);
		e9.setReportingManager(e3);
		e10.setReportingManager(e4);
		e11.setReportingManager(e3);
		e12.setReportingManager(e4);

		// Create List of subordinates and add to Managers
		listOfSubordinates.add(e1);
		listOfSubordinates.add(e5);
		listOfSubordinates.add(e7);
		listOfSubordinates.add(e9);
		listOfSubordinates.add(e11);
		e3.setListOfSubordinates(listOfSubordinates);
		listOfSubordinates.clear();
		listOfSubordinates.add(e2);
		listOfSubordinates.add(e6);
		listOfSubordinates.add(e8);
		listOfSubordinates.add(e10);
		listOfSubordinates.add(e12);
		e4.setListOfSubordinates(listOfSubordinates);

		// add all employees to a list
		EmployeeManager em = new EmployeeManager();
		em.getEmployeeList().add(e1);
		em.getEmployeeList().add(e2);
		em.getEmployeeList().add(e3);
		em.getEmployeeList().add(e4);
		em.getEmployeeList().add(e5);
		em.getEmployeeList().add(e6);
		em.getEmployeeList().add(e7);
		em.getEmployeeList().add(e8);
		em.getEmployeeList().add(e9);
		em.getEmployeeList().add(e10);
		em.getEmployeeList().add(e11);
		em.getEmployeeList().add(e12);

		System.out.println("*** Test Data Populated Successfully! ***");
		System.out.println();
		return employeeList = em.getEmployeeList();
	}

}
