package ch12.sec03;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	//��ü�� ����ó��
	public boolean equals(Object obj) {
		return id.equals(((Member)obj).id);
	}
}
