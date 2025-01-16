package lab_1;
public class question2 {
	public static void main(String[] args) {
		int[] arr = { 90, 80, 40 };

		for (int i = 0; i < 3; i++) {

			if (arr[i] >= 90) {
				System.out.println("Mark Secured in subject " + (i + 1) + " " + arr[i] + " O Grade");
			} else if (arr[i] < 90 & arr[i] >= 80) {
				System.out.println("Mark Secured in subject " + (i + 1) + " " + arr[i] + " E Grade");
			} else if (arr[i] < 80 & arr[i] >= 70) {
				System.out.println("Mark Secured in subject " + (i + 1) + " " + arr[i] + " A Grade");
			} else if (arr[i] < 70 & arr[i] >= 60) {
				System.out.println("Mark Secured in subject " + (i + 1) + " " + arr[i] + " B Grade");
			} else if (arr[i] < 60 & arr[i] >= 50) {
				System.out.println("Mark Secured in subject " + (i + 1) + " " + arr[i] + " C Grade");
			}
		}

	}
}