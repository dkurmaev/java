package ait.employee.dao;

import ait.employee.model.Employee;

public interface Company {
	boolean addEmployee(Employee employee);

	Employee removeEmployee(int id);

	Employee findEmployee(int id);

	int quantity();

	double totalSalary();

	double averageSalary();

	double totalSales();

	void printEmployees();

	Employee[] findEmployeesHoursGreaterThan(int hours);

	Employee[] findEmployeesSalaryRange( int minSalary, int maxSalary);
}
