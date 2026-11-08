package com.student;

import java.util.HashSet;
import java.util.Set;

public class StudentDatabase {

	public static Set<Student> allStudent = new HashSet<>();

	public static void studentDb(Student s) {
		allStudent.add(s);
	}

	public static Set<Student> getAllStudents() {
		return allStudent;
	}

}
