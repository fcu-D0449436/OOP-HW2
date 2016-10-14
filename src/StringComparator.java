import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean check=true;
		do{		
			System.out.println("Enter a string 1:");
			String str1 = scn.next();
			System.out.println("Enter a string 2:");
			String str2 = scn.next();
			
			if (str1.equalsIgnoreCase(str2)){
				System.out.println("The two strings are the same.");
				check=false;
			}
			else{
				System.out.println("The two strings are not the same.");
			}
		}while(check);
			
	}

}
