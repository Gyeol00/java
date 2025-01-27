package test6.sub05;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Subject(String subName) {
		this.subName = subName;
		this.students = new Student[10];
		this.studentCount = 0;
	}
	
	public void addStudent(Student student) {
		List<Subject> subject = new ArrayList<>();
		subject.add(java);
	}
	
	public void printSubjectInfo() {
		System.out.println("과목명 : " + subName);
		System.out.println("수강생 : " + students);
	}
	
	public String getSubName() {
		return subName;
	}
	
}
