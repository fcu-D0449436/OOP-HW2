import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
				
		System.out.println("Enter a integer:");
		int integer = scn.nextInt();
		System.out.println("Enter a float point number:") ;
		float num = scn.nextFloat();
		System.out.println("Enter a you name:");
		String name = scn.next();
	
		System.out.printf("Hi %s, the multiplication of %d and %f is %2.2e.",name,integer,num,(num*integer));
		
		
	}

}
