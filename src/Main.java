import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by robertabell on 7/17/17.
 */


public class Main {


    public static void main(String[] args) {

        showResults(getUserInput(), getUserInput());

    }



    private static void showResults(double operand1, double operand2) {
        final double SUM = operand1 + operand2;
        final double DIFFERENCE = operand1 - operand2;
        final double DIVISION   = operand1/operand2;
        final double MULTIPLICATION = operand1 * operand2;
        final double REMAINDER = operand1%operand2;
        System.out.println("The sum of " + " " + operand1 + " & " + operand2 + " is " + SUM);
        System.out.println("The difference of " + " " + operand1 + " & " + operand2 + " is " + DIFFERENCE);
        System.out.println( operand1 + " divided by " + operand2 + " is " + DIVISION);
        System.out.println(operand1 + " multiplied by " + operand2 + " is " + MULTIPLICATION);
        System.out.println(REMAINDER + " is the remainder of " + operand1+ "divided by " + operand2 );

    }
    public static double getUserInput(){
         Scanner scanner = new Scanner( System.in);
         System.out.println("Enter a Number");
         double userInput = 0;
         while (true) {
            System.out.println("Type a double-type number:");
            try {
                userInput = Double.parseDouble(scanner.nextLine());
                break; // will only get to here if input was a double
            } catch (NumberFormatException ignore) {
                System.out.println("Invalid input");
            }
        }


        return userInput;

    }


}
