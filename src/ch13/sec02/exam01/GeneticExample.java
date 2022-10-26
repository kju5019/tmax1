package ch13.sec02.exam01;

public class GeneticExample {

	public static void main(String[] args) {
		Product<Tv,String> product1 = new Product<>();
		product1.setkind(new Tv());
		product1.setModel1("½º¸¶Æ®tv");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println(tv+":"+tvModel);
	}

}
