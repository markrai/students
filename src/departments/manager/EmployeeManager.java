package departments.manager;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import departments.configuration.Config;
import departments.entity.Department;
import departments.entity.Employee;
import departments.test.TestData;



public class EmployeeManager extends BaseManager {

	List<Employee> employeeList = new ArrayList<Employee>();

	public void getEmployeelessManagers() throws Exception {

		List<Employee> allEmployees = new ArrayList<Employee>();
		List<Employee> employeelessManagers = new ArrayList<Employee>();

		allEmployees = TestData.createTestData();

		for (Employee e : allEmployees) {

			if (e.getType() == Config.MGR && e.getListOfSubordinates().isEmpty()) {

				employeelessManagers.add(e);

			}

		}

		System.out.println("These Managers do not have employees under them:");
		System.out.println(employeelessManagers);

	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public void getMonthlyAllocationforManager(int managerId) throws Exception {

		List<Employee> allEmployees = new ArrayList<Employee>();
		Employee manager = new Employee();
		BigDecimal totalAllocation = BigDecimal.valueOf(0);

		allEmployees = TestData.createTestData();

		for (Employee e : allEmployees) {

			if (e.getId().equals(managerId)) {

				manager = e;
				totalAllocation = e.getAllocation();

			}

		}

		if (!manager.getListOfSubordinates().isEmpty()) {

			for (Employee e : manager.getListOfSubordinates()) {

				totalAllocation = totalAllocation.add(e.getAllocation());

				for (Employee f : e.getListOfSubordinates()) {

					totalAllocation = totalAllocation.add(f.getAllocation());

				}

			}

			System.out.println("The total allocation for " + manager.getName() + " is: " + totalAllocation);
			System.out.println(
					"For this test, we accounted for this manager's salary and anyone under him 2 levels deep.");
		}

	}

	@Test
	public void getMonthlyAllocationforDepartment(int departmentId) throws Exception {

		List<Employee> allEmployees = TestData.createTestData();
		List<Employee> departmentEmployees = new ArrayList<Employee>();
		BigDecimal departmentAllocation = BigDecimal.valueOf(0);

		Department d = new Department();
		d.setName("Accounting");

		for (Employee e : allEmployees) {

			if (e.getDepartment() == departmentId) {

				departmentEmployees.add(e);

			}
		}

		for (Employee f : departmentEmployees) {

			departmentAllocation = departmentAllocation.add(f.getAllocation());

			if (!f.getListOfSubordinates().isEmpty()) {

				for (Employee g : f.getListOfSubordinates()) {

					departmentAllocation = departmentAllocation.add(g.getAllocation());

					if (!g.getListOfSubordinates().isEmpty()) {

						for (Employee h : g.getListOfSubordinates()) {

							departmentAllocation = departmentAllocation.add(h.getAllocation());
						}

					}

				}
			}

		}

		System.out.println("The total allocation for department: " + d.getName() + " is " + departmentAllocation);

	}

}
