import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String num;
		System.out.println("Enter a integer:");
		int integer = scn.nextInt();
		switch (integer) {
		case 1:
			num="ONE";
			break;
		case 2:
			num="TWO";
			break;
		case 3:
			num="THREE";
			break;
		case 4:
			num="FOUR";
			break;
		case 5:
			num="FIVE";
			break;
		case 6:
			num="SIX";
			break;
		case 7:
			num="SEVEN";
			break;
		case 8:
			num="EIGHT";
			break;
		case 9:
			num="NINE";
			break;
		default:
			num="OTHER";		
		}
		System.out.printf("The input integer is %s.",num);
	}

}
