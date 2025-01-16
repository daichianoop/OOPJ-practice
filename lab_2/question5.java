package lab_2;
public class question5 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < args.length; i++) {
            int x = Integer.parseInt(args[i]);
            ++(arr[x]);
        }
        for (int i = 0; i < len; i++) {
            if (arr[i] > 0) {
                System.out.println("Occurrence of " + i + ": " + arr[i]);
            }
        }
    }
}