package lab_1;

/*
Write a program to print the week day for the given day no. of the current month using switch case statement
*/

public class q3 {
	public static void main(String[] args) {
		System.out.println("Enter Day Length: 6");
		int len = 6;
		int dayNo = len % 7;

		switch (dayNo) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Sunday");
				break;
		}
	}
}
