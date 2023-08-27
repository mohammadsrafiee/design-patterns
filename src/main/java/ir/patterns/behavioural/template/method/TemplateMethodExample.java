package ir.patterns.behavioural.template.method;

import java.util.List;

import ir.patterns.behavioural.template.method.impl.Student;
import ir.patterns.behavioural.template.method.impl.StudentJsonBmiCalculator;
import ir.patterns.behavioural.template.method.impl.StudentXmlBmiCalculator;
import ir.patterns.behavioural.template.method.impl.TeenageStudentJsonBmiCalculator;

public class TemplateMethodExample {

	public static void main(String[] args) {
		TeenageStudentJsonBmiCalculator teenageStudentJsonBmiCalculator = new TeenageStudentJsonBmiCalculator();
		List<Student> calculateBmiAndReturnStudents = teenageStudentJsonBmiCalculator.calculateBmiAndReturnStudents();
		for (Student student : calculateBmiAndReturnStudents) {
			System.out.println(student.toString());
		}
		
		System.out.println("----------------------------------------------------");
		
		StudentJsonBmiCalculator studentJsonBmiCalculator = new StudentJsonBmiCalculator();
		List<Student> calculateBmiAndReturnStudentsJson = studentJsonBmiCalculator.calculateBmiAndReturnStudents();
		for (Student student : calculateBmiAndReturnStudentsJson) {
			System.out.println(student.toString());
		}

		System.out.println("----------------------------------------------------");

		StudentXmlBmiCalculator studentXmlBmiCalculator = new StudentXmlBmiCalculator();
		List<Student> calculateBmiAndReturnStudentsXml = studentXmlBmiCalculator.calculateBmiAndReturnStudents();
		for (Student student : calculateBmiAndReturnStudentsXml) {
			System.out.println(student.toString());
		}
	}

}
