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

    public static void setInitialDisplay(){
        UserInput.first = 0.0d;
        System.out.println(first);
        getFirstNumber();
        getOperator();
        getUpdatedDisplay();
    }
//first number in equation
    public static void getFirstNumber () {
        System.out.println("Enter first number");
        first = scan.nextDouble();
        }
//operator used
    public static void getOperator() {
        System.out.println("Enter operator");
        operator = scan.next();
        operatorSwitch(operator);
    }

//second number in equation
    public static void getSecondNumber() {
        System.out.println("Enter second number");
        second = scan.nextDouble();
    }
//updates display
    public static void getUpdatedDisplay(){
        first = answer;
        System.out.println(answer);
        getOperator();
    }
}









