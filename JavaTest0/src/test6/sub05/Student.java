package test6.sub05;

public class Student {

	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}
	
	public void enrollSubject(Subject subject) {
		subject.addStudent(this);
	}
	
	public void setScore(Subject subject) {
		subject.addStudent(null);
	}
	
	public void printStudentInfo() {
		System.out.println("학생명 : " + name);
		System.out.println("아이디 : " + studentId);
		System.out.println("성적");
		System.out.println("- 자바:" + scores + "\n" + "- 데이터베이스:" + scores);
	}
	
	public String getName() {
		return name;
	}
	
	
}
