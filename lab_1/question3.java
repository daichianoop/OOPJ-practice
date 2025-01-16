package lab_1;
public class question3 {
	public static void main(String[] args) {
		System.out.println("Enter Day Number");
		int len = 6;
		int day = len % 7;

		switch (day) {
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
