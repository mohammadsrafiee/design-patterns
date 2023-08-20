package ir.patterns.behavioral.template.method.impl;

import java.util.ArrayList;
import java.util.List;

public class JsonStudentApi {

	public List<Student> getStudents() {
		List<Student> result = new ArrayList<>();
		List<Student> students = (new StudentApi()).getStudents();
		for (Student student : students) {
			if (student.getName().toLowerCase().contains("json")) {
				result.add(student);
			}
		}
		return result;
	}
}
