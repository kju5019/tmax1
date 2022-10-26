package ch12.vertify;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	//hashCode ÀçÁ¤ÀÇ
	@Override
	public int hashCode() {		
		return studentNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student student) {
		if(studentNum.equals(student.getStudentNum()))
				return true;		
		}return false;
	} 
	
}
