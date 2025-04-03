package lab_5.q2;

/*
 * Define an interface Motor with a data member –capacity and two methods such as run() and consume(). 
 * Define a Java class ‘Washing machine’ which implements this interface and
 * write the code to check the value of the interface data member thru an object of the class.
 */

interface Motor {
    int capacity = 10;

    void run();

    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("Washing machine running...");
    }

    public void consume() {
        System.out.println("Washing machine consuming power...");
    }

    void displayCapacity() {
        System.out.println("Capacity of the motor is " + capacity);
    }
}

public class Main {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        wm.displayCapacity();
    }
}
