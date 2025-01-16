package lab_2.classex;
import java.util.Scanner;
class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		System.out.println(name);
		System.err.println(gender);
		sc.close();
	}
}