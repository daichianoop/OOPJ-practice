package lab_6.q5;

/*
Create an user defined exception named CheckArgument to check
the number of arguments passed through command line. If the number of arguments is
less than four then throw the Check Argument exception, else print the addition of squares
of all the four elements.
*/

class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class Main {

    public static boolean argChk(String[] args) throws CheckArgument {
        int sum = 0;
        if (args.length < 4) {
            throw new CheckArgument("Arguments are less than 4. ");
        } else {
            for (int i = 0; i < args.length; i++) {
                sum = sum + (Integer.parseInt(args[i])) * (Integer.parseInt(args[i]));
            }
        }
        System.out.println(sum);
        return true;
    }

    public static void main(String[] args) {

        try {
            argChk(args);
        } catch (Exception e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getMessage());
        }

    }
}
