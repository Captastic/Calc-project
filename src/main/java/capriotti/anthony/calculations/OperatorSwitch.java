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
            case "Exponent":
                UserInput.getSecondNumber();
                calculations.exponent(first, second);
                getUpdatedDisplay();
                break;
            default:
                System.out.println("You didn't say the magic word");
                getOperator();
                break;

        }
    }

}
