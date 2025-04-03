public class MiddleCharacterFinder {
    public static void main(String[] args) {
        String str = "hello";  // Example string
        System.out.println("Middle character(s): " + getMiddleCharacter(str));

        str = "worlds";  // Example string with even length
        System.out.println("Middle character(s): " + getMiddleCharacter(str));
    }

    public static String getMiddleCharacter(String str) {
        int length = str.length();
        int mid = length / 2;

        if (length % 2 == 0) {
            return str.substring(mid - 1, mid + 1); // Two middle characters
        } else {
            return str.substring(mid, mid + 1); // Single middle character
        }
    }
}
