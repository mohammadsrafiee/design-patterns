package com.patterns.behavioural.template.method.impl;

import java.util.List;

/**
 * Define the skeleton of an algorithm in an operation, deferring some steps to
 * subclasses. Template method lets subclasses redefine certain steps of an
 * algorithm without changing the algorithm structure.
 * 
 * redefine certain steps by{@link TeenageStudentJsonBmiCalculator} ,
 * {@link StudentXmlBmiCalculator}, {@link StudentJsonBmiCalculator}
 * 
 */
public abstract class StudentBmiCalculator {

	public abstract List<Student> getStudents();

	public List<Student> filter(List<Student> students) {
		return students;
	}

	private void calculateStudentBmi(List<Student> students) {
		if (students != null) {
			for (Student student : students) {
				double calculatedBmi = this.calculateBmi(student.getHeigh(), student.getWeight());
				student.setBmi(calculatedBmi);
			}
		}
	}

	private double calculateBmi(double height, int weight) {
		return (height / Math.pow(weight, 2));
	}

	public List<Student> calculateBmiAndReturnStudents() {
		List<Student> students = this.getStudents();
		List<Student> filtered = this.filter(students);
		this.calculateStudentBmi(filtered);
		return filtered;
	}
}
