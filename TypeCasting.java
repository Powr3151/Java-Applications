public class TypeCasting{
	public static void main(String[] args) {
		//Widening
		double num = 10;
		
		System.out.printf("The value is %f%n", num);
		
		//Narrowing
		double price = 32.89;
		int result =(int)price;
		
		System.out.printf("The price is %d%n", result);
	}
	
}
