package com.ex.emp_with_max_salary_from_each_dept;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		var employees = Arrays.asList(
				new Employee(101,"John","IT",30000d),
				new Employee(102,"Bob","Management",36000d),
				new Employee(103,"Eva","IT",35000d),
				new Employee(104,"Raj","IT",45000d),
				new Employee(105,"Mohan","Management",44000d),
				new Employee(106,"Rohit","Management",34000d),
				new Employee(107,"Vijay","HR",54000d),
				new Employee(108,"Tina","HR",44000d)
				);
		
		
		var result = employees.stream()
				.collect(Collectors.groupingBy(
						e -> e.getDept(),
						Collectors.maxBy((e1,e2) -> e1.getSalary().compareTo(e2.getSalary()))
						
						));
		
		result.entrySet().forEach(e -> {
			System.out.println(e.getKey());
//			e.getValue().forEach(System.out::println);
			System.out.println(e.getValue());
		});
		
	}
}
