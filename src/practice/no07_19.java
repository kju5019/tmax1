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
Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
int i = 0; // Product cart index 배열 에 사용될

	void buy(Product p) {
	
//	1.1 . 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다
		if(money < p.price) {System.out.println("잔액 부족"); return;}
//	1.2 , 가진 돈이 충분하면 제품의 가격을 가진 돈에서 빼고
		else {money -= p.price; }
//	1.3 . 장바구니에 구입한 물건을 담는다 (add 메서드 호출)
		add(p);
		
	}
	
	void add(Product p) {	
//	1.1 i의 값이 장바구니의 크기보다 같거나 크면
		if(i >= cart.length){
//	1.1.1 2 . 기존의 장바구니보다 배 큰 새로운 배열을 생성한다
		Product[] newCart = new Product[cart.length * 2];
//	1.1.2 . 기존의 장바구니의 내용을 새로운 배열에 복사한다
		System.arraycopy(cart, 0, newCart, 0, cart.length);
//	1.1.3 . 새로운 장바구니와 기존의 장바구니를 바꾼다
		cart = newCart;
		}
//	1.2 . 물건을 장바구니 (cart)에 저장한다 그리고 i의 1값을 증가시킨다

		cart[i] = p; i++;

	
	}
	

	void summary() {
//	1.1 . 장바구니에 담긴 물건들의 목록을 만들어 출력한다
		int sum = 0;
		System.out.println("구입한 물건: ");
		for(int x=0; x<cart.length; x++) {
			if(cart[x] == null) break;
			sum += cart[x].price;
			System.out.println(cart[x]+",");
		}
//	1.2 . 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다
		System.out.println("사용한 금액: "+sum);
//	1.3 (money) . 물건을 사고 남은 금액 를 출력한다
		System.out.println("남은 금액: "+(money-sum));
	
	} // summary()
	}


	class Product {
	int price; // 제품의 가격
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