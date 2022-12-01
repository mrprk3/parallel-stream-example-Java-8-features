package com.mrprk.parallel.stream;

import java.util.stream.IntStream;

public class ParallelStreamEx {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;

		start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Plain stream took time  " + (end - start));

		start = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Parallel stream took time  " + (end - start));

		// using stream calculate average of sal, lets check time
		start = System.currentTimeMillis();
		double aveNormalStream = EmployeeDB.getAllEmp().stream().map(Employee::getSalary).mapToDouble(i -> i).average()
				.getAsDouble();
		end = System.currentTimeMillis();
		System.out.println(aveNormalStream);
		System.out.println("Plain stream took time  " + (end - start));

		// using parallel stream calculate average of sal, lets check time
		start = System.currentTimeMillis();
		double aveParallelStream = EmployeeDB.getAllEmp().parallelStream().map(Employee::getSalary).mapToDouble(i -> i)
				.average().getAsDouble();
		System.out.println(aveParallelStream);
		end = System.currentTimeMillis();
		System.out.println("Plain stream took time  " + (end - start));

	}

}
