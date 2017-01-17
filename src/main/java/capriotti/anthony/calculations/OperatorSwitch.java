package capriotti.anthony.calculations;

import static capriotti.anthony.calculations.UserInput.*;

/**
 * Created by anthonycapriotti on 1/16/17.
 */
public class OperatorSwitch {
    static Calculations calculations = new Calculations();

    public static void operatorSwitch(String choice){

        switch (choice.toUpperCase()){
            case "CLEAR":
                getFirstNumber();
                getOperator();
                break;
            case "ADD":
                UserInput.getSecondNumber();
                calculations.addition(first, second);
                getUpdatedDisplay();
                break;
            case "SUBTRACT":
                UserInput.getSecondNumber();
                calculations.subtraction(first, second);
                getUpdatedDisplay();
                break;
            case "MULTIPLY":
                UserInput.getSecondNumber();
                calculations.multiplication(first, second);
                getUpdatedDisplay();
                break;
            case "DIVIDE":
                UserInput.getSecondNumber();
                calculations.division(first, second);
                getUpdatedDisplay();
                break;
            case "POWER":
                UserInput.getSecondNumber();
                calculations.power(first, second);
                getUpdatedDisplay();
                break;
            case "SQUARE":
                calculations.squared(first);
                getUpdatedDisplay();
                break;
            case "SQUARE ROOT":
                calculations.squareRoot(first);
                getUpdatedDisplay();
                break;
            case "ABSOLUTE":
                calculations.absoluteValue(first);
                getUpdatedDisplay();
                break;
            case "INVERSE":
                calculations.inverse(first);
                getUpdatedDisplay();
                break;
            case "SINE":
                calculations.sine(first);
                getUpdatedDisplay();
                break;
            case "COSINE":
                calculations.cosine(first);
                getUpdatedDisplay();;
                break;
            case "TANGENT":
                calculations.tangent(first);
                getUpdatedDisplay();
                break;
            default:
                System.out.println("You didn't say the magic word");
                getOperator();
                break;

        }
    }

}
