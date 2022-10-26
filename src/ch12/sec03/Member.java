package ch12.sec03;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	//객체의 동등처리
	public boolean equals(Object obj) {
		return id.equals(((Member)obj).id);
	}
}
