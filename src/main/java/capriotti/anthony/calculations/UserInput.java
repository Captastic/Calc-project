package capriotti.anthony.calculations;

import java.util.Scanner;

/**
 * Created by anthonycapriotti on 1/16/17.
 */
import static capriotti.anthony.calculations.OperatorSwitch.*;


public class UserInput {
    static double first, second, answer;
    static String operator;
    static Scanner scan = new Scanner(System.in);


    public static void getFirstNumber () {
            System.out.println("Enter first number");
            first = scan.nextDouble();
        }

    public static void getOperator() {
        System.out.println("Enter operator");
        operator = scan.next();
        operatorSwitch(operator);
    }


    public static void getSecondNumber() {
        System.out.println("Enter second number");
        second = scan.nextDouble();
    }
    public static void getUpdatedDisplay(){
        first = answer;
        System.out.println(answer);
        getOperator();
    }
}









