/*
Aim of the program : Accept 10 numbers from command line and check how many of them are
even and how many are odd.
*/

package lab_2;

public class q2 {

	public static void main(String[] args) {
		int arr_num[] = new int[10];

		for (int i = 0; i < 10; i++) {
			arr_num[i] = Integer.parseInt(args[i]);
		}

		System.out.println("Even numbers: ");
		for (int j = 0; j < 10; j++) {
			if (arr_num[j] % 2 == 0) {
				System.out.println(arr_num[j]);
			}
		}

		System.out.println("Odd numbers: ");
		for (int j = 0; j < 10; j++) {
			if (arr_num[j] % 2 != 0) {
				System.out.println(arr_num[j]);
			}

		}
	}
}