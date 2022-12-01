package com.mrprk.parallel.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDB {

	public static List<Employee> getAllEmp() {

		List<Employee> emp = new ArrayList<Employee>();

		for (int i = 1; i <= 1000; i++) {
			emp.add(new Employee(i, "Name" + i, Integer.valueOf(new Random().nextInt(1000 * 100)), "A"));
		}

		return emp;

	}

}
