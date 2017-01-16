package capriotti.anthony.calculations;

import static capriotti.anthony.calculations.UserInput.*;

/**
 * Created by anthonycapriotti on 1/16/17.
 */
public class OperatorSwitch {
    static Calculations calculations = new Calculations();

    public static void operatorSwitch(String choice){

        switch (choice){
            case "Clear":
                getFirstNumber();
                getOperator();
                break;
            case "Add":
                UserInput.getSecondNumber();
                calculations.addition(first, second);
                getUpdatedDisplay();
                break;
            case "Subtract":
                UserInput.getSecondNumber();
                calculations.subtraction(first, second);
                getUpdatedDisplay();
                break;
            case "Multiply":
                UserInput.getSecondNumber();
                calculations.multiplication(first, second);
                getUpdatedDisplay();
                break;
            case "Divide":
                UserInput.getSecondNumber();
                calculations.division(first, second);
                getUpdatedDisplay();
                break;
            case "Power":
                UserInput.getSecondNumber();
                calculations.power(first, second);
                getUpdatedDisplay();
                break;
            case "Squared":
                calculations.squared(first);
                getUpdatedDisplay();
                break;
            case "Square Root":
                calculations.squareRoot(first);
                getUpdatedDisplay();
                break;
            case "Absolute":
                calculations.absoluteValue(first);
                getUpdatedDisplay();
                break;
            case "Inverse":
                calculations.inverse(first);
                getUpdatedDisplay();
                break;
            case "Sine":
                calculations.sine(first);
                getUpdatedDisplay();
                break;
            case "Cosine":
                calculations.cosine(first);
                getUpdatedDisplay();;
                break;
            case "Tangent":
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
