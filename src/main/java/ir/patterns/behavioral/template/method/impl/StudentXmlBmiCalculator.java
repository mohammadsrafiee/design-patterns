package ir.patterns.behavioral.template.method.impl;

import java.util.ArrayList;
import java.util.List;

public class StudentXmlBmiCalculator extends StudentBmiCalculator {

	/**
	 * read data from a XML Datasource
	 */
	private XmlStudentApi api;

	public StudentXmlBmiCalculator() {
		this.setApi(new XmlStudentApi());
	}

	@Override
	public List<Student> getStudents() {
		return api.getStudents();
	}

	@Override
	public List<Student> filter(List<Student> students) {
		List<Student> result = new ArrayList<>();
		for (Student student : students) {
			if (student.getAge() > 10 && student.getAge() < 30) {
				result.add(student);
			}
		}
		return result;
	}

	public XmlStudentApi getApi() {
		return api;

	}

	public void setApi(XmlStudentApi api) {
		this.api = api;

	}
}
