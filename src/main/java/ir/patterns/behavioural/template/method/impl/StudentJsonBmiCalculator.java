package ir.patterns.behavioural.template.method.impl;

import java.util.List;

public class StudentJsonBmiCalculator extends StudentBmiCalculator {

	/**
	 * read data from a JSON Datasource
	 */
	private JsonStudentApi api;

	public StudentJsonBmiCalculator() {
		this.setApi(new JsonStudentApi());
	}

	@Override
	public List<Student> getStudents() {
		return api.getStudents();
	}

	public JsonStudentApi getApi() {
		return api;

	}

	public void setApi(JsonStudentApi api) {
		this.api = api;

	}

}
