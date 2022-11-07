package ch06; 
//18번
public class ShopService {
	private static ShopService shopService = new ShopService();
	
	private shopService() {}
	
	public static ShopService getInstance() {
		return shopService;
	}

}
