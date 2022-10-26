package ch13.sec05;

public class Course {
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+"��(��) Course1�� �����");
	}
	
	public static void registerCourse2(Applicant<? extends Student> applicant) {  //�˼��� ������ Student�� �ڽĵ�
		System.out.println(applicant.kind.getClass().getSimpleName()+"��(��) Course2�� �����");
	}
		
	public static void registerCourse3(Applicant<? super Worker> applicant) {  //�˼��� ������ Worker�� �θ��
		System.out.println(applicant.kind.getClass().getSimpleName()+"��(��) Course3�� �����");
	}

}
