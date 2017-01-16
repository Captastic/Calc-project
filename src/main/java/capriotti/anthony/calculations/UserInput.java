package capriotti.anthony.calculations;

import java.util.Scanner;

/**
 * Created by anthonycapriotti on 1/16/17.
 */
import static capriotti.anthony.calculations.OperatorSwitch.*;


public class UserInput {
    static double first, second, answer;
    static String operator;

    public static void input(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        first = scan.nextDouble();
        System.out.println("Enter operator");
        operator= scan.next();
        System.out.println("Enter second number");
        second = scan.nextDouble();


    }
}
