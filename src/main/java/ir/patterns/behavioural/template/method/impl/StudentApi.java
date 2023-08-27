package ir.patterns.behavioural.template.method.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentApi {
	
	private static final List<Student> students ;
	static {
		students = new ArrayList<>(Arrays.asList(
				new Student("Mahmood Ahmadi (JSON)", 10, 210d, 78 , 0),
				new Student("Akbar Razavi (JSON)", 14, 185d, 78 , 0),
				new Student("Mikel Davoudi (JSON)", 15, 87d, 78 , 0),
				new Student("Javad Esmaeili (JSON)", 17, 90d, 78 , 0),
				new Student("Maryam Shamlo (JSON)", 19, 122d, 78 , 0),
				new Student("Ali Amoo Ameri (JSON)", 10, 186d, 78 , 0),
				new Student("Mohammad Darbandi (JSON)", 20, 197d, 78 , 0),
				new Student("Ali Rezazade (JSON)", 31, 127d, 78 , 0),
				new Student("Amer Razzavipoor (JSON)", 41, 78d, 78 , 0),
				new Student("Reza Ahmadi (XML)", 10, 210d, 78 , 0),
				new Student("Javad Razi (XML)", 14, 185d, 78 , 0),
				new Student("Akbar Ahmadi (XML)", 15, 87d, 78 , 0),
				new Student("Mikel Ahmad Ali (XML)", 17, 90d, 78 , 0),
				new Student("Sara Shahmohammadi (XML)", 19, 122d, 78 , 0),
				new Student("Sadegh Razavi (XML)", 10, 186d, 78 , 0),
				new Student("Mohammad Rezvani (XML)", 20, 197d, 78 , 0),
				new Student("Rezvan Rezaei (XML)", 31, 127d, 78 , 0),
				new Student("Amer Akbari (XML)", 41, 78d, 78 , 0),
				new Student("Davvod Ameri (JSON)", 55, 34d, 78 , 0)));
	}
	public List<Student> getStudents(){
		return students;
	}

}
