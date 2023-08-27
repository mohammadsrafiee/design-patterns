package ir.patterns.behavioural.template.method.impl;

import java.util.ArrayList;
import java.util.List;

public class XmlStudentApi {

	public List<Student> getStudents() {
		List<Student> result = new ArrayList<>();
		List<Student> students = (new StudentApi()).getStudents();
		for (Student student : students) {
			if (student.getName().toLowerCase().contains("xml")) {
				result.add(student);
			}
		}
		return result;
	}

}
