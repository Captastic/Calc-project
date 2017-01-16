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
            getUpdatedDisplay();
        }
            return answer = firstNumber / secondNumber;
        }

    public static double power(double firstNumber, double secondNumber){
        return answer = Math.pow(firstNumber, secondNumber);
    }

    public static double squared(double firstNumber){
        return answer= firstNumber * firstNumber;
    }

    public static double squareRoot(double firstNumber){
        return answer = Math.sqrt(firstNumber);
    }

    public static double absoluteValue(double firstNumber){
        return answer = Math.abs(firstNumber);
    }

    public static double inverse(double firstNumber){
        return answer = (1/firstNumber);
    }

    public static double sine(double firstNumber){
        return answer = Math.sin(firstNumber);
    }

    public static double cosine(double firstNumber){
        return answer = Math.cos(firstNumber);
    }

    public static double tangent(double firstNumber){
        return answer = Math.tan(firstNumber);
    }


}
