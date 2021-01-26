package com.java8.stream;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.java8.student.Student;
import com.java8.student.StudentDataBase;

public class StreamMain {

	static Predicate<Student> maleStudent = (s) -> s.getGender().equalsIgnoreCase("male");
	public static void main(String[] args) {
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		// reduce, filter, predicate , optional, map
		Optional<Integer>noOfNoteBooks = noOfNoteBooks(studentList);
		if (noOfNoteBooks.isPresent()) {
			System.out.println("No of books : " + noOfNoteBooks.get());
		}
	}

	private static Optional<Integer> noOfNoteBooks(List<Student> studentList) {
		
		return studentList.parallelStream()
				.filter((s) -> s.getGender().equalsIgnoreCase("male"))
				.map((s)->s.getNoteBooks())
				.reduce((s1,s2)->s1+s2);
	}
}
