package lab_2;
public class question4 {
    static int Calls = 0;
    SystemCall() {
        Calls++;
    }
    public static void main(String[] args) {
        new SystemCall();
        new SystemCall();
        System.out.println("No of calls: " + Calls);
    }
}