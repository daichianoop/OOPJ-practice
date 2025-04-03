package lab_2;

/*
Program to find no. of objects created out of a class using ‘static’
modifier.
*/

public class q4 {
    static int noOfCalls = 0;

    q4() {
        noOfCalls++;
    }

    public static void main(String[] args) {
        new q4();
        new q4();
        System.out.println("No of calls: " + noOfCalls);

    }
}