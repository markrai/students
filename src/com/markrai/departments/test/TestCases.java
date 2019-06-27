package com.markrai.departments.test;

import org.junit.Test;

import com.markrai.departments.manager.EmployeeManager;

public class TestCases {

	static final int managerId = 3; // id of manager
	static final int departmentId = 1; // id of department

	// Tests for Managers which have NO employees under them.

	@Test
	public void testEmployeelessManagers() throws Exception {

		EmployeeManager em = new EmployeeManager();
		em.getEmployeelessManagers();

	}

	// The following test lists the net allocation of a manager
	@Test
	public void testMonthlyAllocationforManager(int mid) throws Exception {
		EmployeeManager em = new EmployeeManager();
		em.getMonthlyAllocationforManager(managerId);
	}

	@Test
	public void testMonthlyAllocationforDepartment(int mid) throws Exception {
		EmployeeManager em = new EmployeeManager();
		em.getMonthlyAllocationforDepartment(departmentId);
	}
}
