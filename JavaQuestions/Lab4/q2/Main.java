package lab_4.q2;

/*
 * 
 * Illustrate the execution of constructors in multi-level inheritance with three Java classes
 * plate(length, width), box(length, width, height), wood box (length, width, height, thick) 
 * where box inherits from plate and woodbox inherits from box class. 
 * Each class has constructor where dimensions are taken from user.
 */
import java.util.Scanner;

class Plate {
    int length, width;

    Plate(Scanner sc) {
        System.out.print("Enter length of plate: ");
        length = sc.nextInt();
        System.out.print("Enter width of plate: ");
        width = sc.nextInt();
        System.out.println("Plate constructor was called.");
        System.out.printf("Dimensions of plate are %d %d\n", length, width);
    }
}

class Box extends Plate {
    int height;

    Box(Scanner sc) {
        super(sc);
        System.out.print("Enter height of box: ");
        height = sc.nextInt();
        System.out.println("Box constructor was called.");
        System.out.printf("Dimensions of Box are %d %d %d\n", length, width, height);
    }
}

class WoodBox extends Box {
    int thickness;

    WoodBox(Scanner sc) {
        super(sc);
        System.out.print("Enter thickness of wood box: ");
        thickness = sc.nextInt();
        System.out.println("WoodBox constructor was called.");
        System.out.printf("Dimensions of WoodBox are %d %d %d %d\n", length, width, height, thickness);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new WoodBox(sc);
        sc.close();
    }
}