package com.patterns.behavioural.template.method.impl;

import java.util.ArrayList;
import java.util.List;

public class TeenageStudentJsonBmiCalculator extends StudentBmiCalculator {

	/**
	 * read data from a JSON Datasource
	 */
	private JsonStudentApi api;

	public TeenageStudentJsonBmiCalculator() {
		this.setApi(new JsonStudentApi());
	}

	@Override
	public List<Student> getStudents() {
		return api.getStudents();
	}

	@Override
	public List<Student> filter(List<Student> students) {
		List<Student> result = new ArrayList<>();
		for (Student student : students) {
			if (student.getAge() > 10 && student.getAge() < 20) {
				result.add(student);
			}
		}
		return result;
	}

	public JsonStudentApi getApi() {
		return api;

	}

	public void setApi(JsonStudentApi api) {
		this.api = api;

	}
}
