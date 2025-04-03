package lab_4.q1;

/*
 * A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box.
 * The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. 
 * Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.
 */

import java.util.Scanner;

class _2D {
    double length, breadth;

    _2D(double l, double b) {
        length = l;
        breadth = b;
    }

    double Area() {
        return length * breadth;
    }
}

class _3D extends _2D {
    double height;

    _3D(double l, double b, double h) {
        super(l, b);
        height = h;
    }

    double Vol() {
        return length * breadth * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sheet dimensions (l,b) :");
        double sL = sc.nextDouble();
        double sB = sc.nextDouble();

        System.out.println("Enter box dimensions (l,b,h) :");
        double bL = sc.nextDouble();
        double bB = sc.nextDouble();
        double bH = sc.nextDouble();

        _2D sheet = new _2D(sL, sB);
        _3D box = new _3D(bL, bB, bH);

        System.out.println("Cost of sheet: INR " + sheet.Area() * 40);
        System.out.println("Cost of box: INR " + box.Vol() * 60);

        sc.close();
    }
}
