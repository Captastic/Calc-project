package capriotti.anthony.calculations;

/**
 * Created by anthonycapriotti on 1/16/17.
 */
import static java.lang.Math.*;
import static capriotti.anthony.calculations.UserInput.*;
public class Calculations {


    public static double addition(double firstNumber, double secondNumber){
        return answer = firstNumber + secondNumber;
    }
    public static double subtraction(double firstNumber, double secondNumber){
        return answer = firstNumber - secondNumber;
    }
    public static double multiplication(double firstNumber, double secondNumber){
        return answer = firstNumber * secondNumber;
    }
    public static double division(double firstNumber, double secondNumber){
        if(secondNumber == 0){
            System.out.println("Error cannot divide by 0");
        }
        return answer = firstNumber / secondNumber;
    }
    public static double exponent(double firstNumber, double secondNumber){
        return answer = Math.pow(firstNumber, secondNumber);
    }


}
