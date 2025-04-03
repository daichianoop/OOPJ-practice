public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Attempting to access an invalid index
            System.out.println("Accessing index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds!");
        }

        System.out.println("Program execution continues...");
    }
}