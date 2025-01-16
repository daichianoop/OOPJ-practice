package lab_2;
public class question2 {
	public static void main(String[] args) {
		int countEven = 0;
		int countOdd = 0 ;
		int arr_num[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr_num[i] = Integer.parseInt(args[i]);
		}
		System.out.println("Even numbers: ");
		for (int j = 0; j < 10; j++) {
			if (arr_num[j] % 2 == 0) {
				countEven = countEven + 1 ;
			} else {
				countOdd = countOdd + 1 ;
			}
		}
	}
}
