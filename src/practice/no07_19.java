package practice;

class no07_19 {
public static void main(String args[]) {
Buyer b = new Buyer();
b.buy(new Tv());
b.buy(new Computer());
b.buy(new Tv());
b.buy(new Audio());
b.buy(new Computer());
b.buy(new Computer());
b.buy(new Computer());
b.summary();
}

}
class Buyer {
int money = 1000;
Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
int i = 0; // Product cart index �迭 �� ����

	void buy(Product p) {
	
//	1.1 . ���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��带 �����Ѵ�
		if(money < p.price) {System.out.println("�ܾ� ����"); return;}
//	1.2 , ���� ���� ����ϸ� ��ǰ�� ������ ���� ������ ����
		else {money -= p.price; }
//	1.3 . ��ٱ��Ͽ� ������ ������ ��´� (add �޼��� ȣ��)
		add(p);
		
	}
	
	void add(Product p) {	
//	1.1 i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ��
		if(i >= cart.length){
//	1.1.1 2 . ������ ��ٱ��Ϻ��� �� ū ���ο� �迭�� �����Ѵ�
		Product[] newCart = new Product[cart.length * 2];
//	1.1.2 . ������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�
		System.arraycopy(cart, 0, newCart, 0, cart.length);
//	1.1.3 . ���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�
		cart = newCart;
		}
//	1.2 . ������ ��ٱ��� (cart)�� �����Ѵ� �׸��� i�� 1���� ������Ų��

		cart[i] = p; i++;

	
	}
	

	void summary() {
//	1.1 . ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�
		int sum = 0;
		System.out.println("������ ����: ");
		for(int x=0; x<cart.length; x++) {
			if(cart[x] == null) break;
			sum += cart[x].price;
			System.out.println(cart[x]+",");
		}
//	1.2 . ��ٱ��Ͽ� ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ�
		System.out.println("����� �ݾ�: "+sum);
//	1.3 (money) . ������ ��� ���� �ݾ� �� ����Ѵ�
		System.out.println("���� �ݾ�: "+(money-sum));
	
	} // summary()
	}


	class Product {
	int price; // ��ǰ�� ����
	Product(int price) {
	this.price = price;
	}
	}
	
	
	class Tv extends Product {
	Tv() { super(100); }
	public String toString() { return "Tv"; }
	}
	class Computer extends Product {
	Computer() { super(200); }
	public String toString() { return "Computer";}
	}
	class Audio extends Product {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}