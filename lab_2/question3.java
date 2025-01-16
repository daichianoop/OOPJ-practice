package lab_2;
import java.util.Arrays;
public class question3 {
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		Arrays.sort(arr, 0, arr.length);
		System.out.print("Sorted Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}