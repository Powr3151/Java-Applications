import java.util.Scanner;

public class MethodOverLoading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		char choice;
		do{
			System.out.println("=======================================");
		System.out.println("Calculating Perimeter of Different shapes");
		System.out.println("=======================================");
		
		System.out.println("Enter 1: For Square");
		System.out.println("Enter 2: For Rectangle");
		System.out.println("Enter 3: For Triangle");
		System.out.println("Enter 4: To Exit");
		
		System.out.print("Enter your option: ");
		int option = input.nextInt();
		
		switch(option){
			case 1:
					System.out.print("Enter the length of the Square: ");
					int squarelength = input.nextInt();
					
					perimeter(squarelength);
					
			break;
			
			case 2:
					System.out.print("Enter the length of the Rectangle: ");
					int length = input.nextInt();
					
					System.out.print("Enter the heigth of the Rectangle: ");
					int heigth = input.nextInt();
					
					perimeter(length, heigth);
			break;
			
			case 3:
					System.out.print("Enter the length1 of the Triangle: ");
					int length1 = input.nextInt();
					
					System.out.print("Enter the length2 of the Triangle: ");
					int length2 = input.nextInt();
					
					System.out.print("Enter the base of the Triangle: ");
					int base = input.nextInt();
					
					perimeter(length1, length2, base);
			break;
			
			case 4:
					System.out.println("Exiting program, Goodbye......");
					
			break;
			
			default:
			System.out.println("Invalid input");
			
		}
		System.out.println();
		System.out.print("Do you want to run the program again(Y/N) ");
		choice = input.next().charAt(0);
		}while(choice == 'Y' || choice == 'y');
		
	}
		
	public static void perimeter(int a){
		int per = 4 * a;
		System.out.println("");
		System.out.println("=======================================");
		System.out.printf("The perimeter of the spuare is %d%n", per);
	}
	
	public static void perimeter(int a, int b){
		int per = 2 * (a + b);
		System.out.println("");
		System.out.println("=======================================");
		System.out.printf("The perimeter of the rectangle is %d%n", per);
	}
	
	public static void perimeter(int a, int b, int c){
		int per = a + b + c;
		System.out.println("");
		System.out.println("=======================================");
		System.out.printf("The perimeter of the triangle is %d%n", per);
	}
}