public class OperatorsPart2{
	public static void main(String[] args) {
		int num1 = 35;
		int num2 = 30;
		int num3 = 17;
		
		//AND LOGICAL OPERATOR
		boolean result = (num1 > num2) && (num1 > num3);
		System.out.printf("The result is %b%n", result);
		
		//OR LOGICAL OPERATOR
		boolean result2 = (num1 > num2) || (num1 > num3);
		System.out.printf("The result is %b%n", result2);
		
		//NOT LOGICAL OPERATOR
		boolean result3 = !(num1 > num2) && (num1 > num3);
		System.out.printf("The result is %b%n", result3);
		
		//UNARY OPERATOR
		//pre-increment
		int num4 = 10;
		System.out.printf("%d%n", num4);
		System.out.printf("%d%n", ++num4);
		
		//post-increment
		int num5 = 10;
		System.out.printf("%d%n", num5);
		System.out.printf("%d%n", num5++);
		
		//pre-decrement
		System.out.printf("%d%n", num4);
		System.out.printf("%d%n", --num4);
		
		//post-decrement
		System.out.printf("%d%n", num5);
		System.out.printf("%d%n", num5--);
		
	}
}