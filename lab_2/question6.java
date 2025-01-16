package lab_2;
public class question6 {
    public static void main(String[] args) {
        int left = 0;
        int right = 0;
        int len = args.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = Integer.parseInt(args[i]);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j)
                    left += arr[i * 3 + j];
                if ((i + j) == (3 - 1))
                    right += arr[i * 3 + j];
            }
        }
        System.out.println("Sum of left diagonal: " + left);
        System.out.println("Sum of right diagonal: " + right);
    }
}