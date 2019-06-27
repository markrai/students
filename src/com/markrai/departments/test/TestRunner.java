package com.markrai.departments.test;

public class TestRunner {

	public static void main(String[] args) throws Exception {

		TestCases tr = new TestCases();
		System.out.println("=============== TEST #1 =============");
		tr.testEmployeelessManagers();
		System.out.println();
		System.out.println("=============== TEST #2 =============");
		tr.testMonthlyAllocationforManager(3);
		System.out.println();
		System.out.println("=============== TEST #3 =============");
		tr.testMonthlyAllocationforDepartment(1);

	}
}
