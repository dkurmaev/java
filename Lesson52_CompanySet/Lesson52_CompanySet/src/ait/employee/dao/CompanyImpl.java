package ait.employee.dao;

import ait.employee.model.Employee;
import ait.employee.model.SalesManager;

public class CompanyImpl implements Company {
	private Employee[] employees;
	private int size;

	public CompanyImpl(int capacity) {
		employees = new Employee[capacity];
	}

	//O(n)
	@Override
	public boolean addEmployee(Employee employee) {
		if (employee == null || size == employees.length || findEmployee(employee.getId()) != null) {
			return false;
		}
		employees[size++] = employee;
		return true;
	}

	//O(n)
	@Override
	public Employee removeEmployee(int id) {
		for (int i = 0; i < size; i++) {
			if (employees[i].getId() == id) {
				Employee victim = employees[i];
				employees[i] = employees[--size];
				employees[size] = null;
				return victim;
			}
		}
		return null;
	}

	//O(n)
	@Override
	public Employee findEmployee(int id) {
		for (int i = 0; i < size; i++) {
			if (employees[i].getId() == id) {
				return employees[i];
			}
		}
		return null;
	}

	//O(1)
	@Override
	public int quantity() {
		return size;
	}

	//O(n)
	@Override
	public double totalSalary() {
		double res = 0;
		for (int i = 0; i < size; i++) {
			res += employees[i].calcSalary();
		}
		return res;
	}


	//O(n)
	@Override
	public double totalSales() {
		double res = 0;
		for (int i = 0; i < size; i++) {
			if (employees[i] instanceof SalesManager) {
				SalesManager salesManager = (SalesManager) employees[i];
				res += salesManager.getSalesValue();
			}
		}
		return res;
	}

	//O(n)
	@Override
	public void printEmployees() {
		for (int i = 0; i < size; i++) {
			System.out.println(employees[i]);
		}
	}

	//O(n)
	@Override
	public Employee[] findEmployeesHoursGreaterThan(int hours) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (employees[i].getHours() > hours) {
				count++;
			}
		}
		Employee[] res = new Employee[count];
		for (int i = 0, j = 0; j < res.length; i++) {
			if (employees[i].getHours() > hours) {
				res[j++] = employees[i];
			}
		}

		return res;
	}

	//O(n)
	@Override
	public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (employees[i].calcSalary() >= minSalary && employees[i].calcSalary() < maxSalary) {
				count++;
			}
		}
		Employee[] res = new Employee[count];
		for (int i = 0, j = 0; j < res.length; i++) {
			if (employees[i].calcSalary() >= minSalary && employees[i].calcSalary() < maxSalary) {
				res[j++] = employees[i];
			}
		}

		return res;
	}
}
