package ch08.sec11.exam03;


public class InstanceofExample {

	public static void main(String[] args) {
		Vehicle[] vs = {new Taxi(), new Bus()};
		Driver driver = new Driver();
		for(Vehicle v:vs)
			driver.run(v);

	}

}
