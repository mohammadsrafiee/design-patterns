package ir.patterns.behavioural.template.method.impl;

public class Student {

	private String name;
	private int age;
	private double heigh;
	private int weight;
	private double bmi;

	public Student() {
	}

	public Student(String name, int age, double heigh, int weight, double bmi) {
		this.setName(name);
		this.setAge(age);
		this.setHeigh(heigh);
		this.setWeight(weight);
		this.setBmi(bmi);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeigh() {
		return heigh;
	}

	public void setHeigh(double heigh) {
		this.heigh = heigh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("name : ");
		buffer.append(name);
		buffer.append(",");
		buffer.append("age : ");
		buffer.append(age);
		buffer.append(",");
		buffer.append("weight : ");
		buffer.append(weight);
		buffer.append(",");
		buffer.append("height : ");
		buffer.append(heigh);
		buffer.append(",");
		buffer.append("bmi : ");
		buffer.append(bmi);
		return buffer.toString();
	}
}
