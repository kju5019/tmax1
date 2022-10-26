package ch08.sec10.exam01;

public class MainExample {

	public static void main(String[] args) {
		A a = new B();
		
		B b = new D();
			a = b;
			a = new D();

			
		b = (B)a;
		D d = (D)b;
		
		A[] arr = new A[5]; //null
		arr[0] = new B(); //A() 인터페이스 타입으로 변환
		arr[1] = new B(); //A()
		arr[2] = new C(); //A()
		arr[3] = new D(); //A()
		arr[4] = new E(); //A()
		
		arr = new A[]{ new B(), new C(), new D(), new E()};
		
		Object[] arrs = {new String(), new Integer(10), new Float(3.14f)};
		
	}

}
