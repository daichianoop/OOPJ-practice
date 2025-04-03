package lab_3.q4;

/*
Write a program to overload subtract method with various parameters in a
class in Java. Write the driver class to use the different subtract methods using object.
 */

class clc {

    public int sub(int a, int b) {
        return a - b;
    }

    public int sub(int a, int b, int c) {
        return a - b - c;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double sub(int a, double b) {
        return a - b;
    }
}

public class Calc {
    public static void main(String[] args) {
        clc clc = new clc();

        int res1 = clc.sub(10, 5);

        int res2 = clc.sub(15, 5, 3);

        double res3 = clc.sub(10.5, 5.2);

        double res4 = clc.sub(10, 3.5);

        System.out.println("Sub: " + res1);
        System.out.println("Sub: " + res2);
        System.out.println("Sub: " + res3);
        System.out.println("Sub: " + res4);

    }
}
