package ch13.sec05;

public class Course {
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course1을 등록함");
	}
	
	public static void registerCourse2(Applicant<? extends Student> applicant) {  //알수는 없지만 Student의 자식들
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course2을 등록함");
	}
		
	public static void registerCourse3(Applicant<? super Worker> applicant) {  //알수는 없지만 Worker의 부모들
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course3을 등록함");
	}

}
