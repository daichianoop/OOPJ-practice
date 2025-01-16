package lab_1;
public class question4 {
    public static void main(String[] args) {
        int num = 12321;

        int ONum = num;
        int Rnum = 0;

        while (num > 0) {
            int rem = num % 10;
            Rnum = Rnum * 10 + rem;
            num /= 10;
        }

        if (ONum == Rnum) {
            System.out.println(ONum + " is a palindrome.");
        } else {
            System.out.println(ONum + " is not a palindrome.");
        }
    }
}
