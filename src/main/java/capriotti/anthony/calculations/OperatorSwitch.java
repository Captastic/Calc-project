package capriotti.anthony.calculations;

import static capriotti.anthony.calculations.UserInput.first;
import static capriotti.anthony.calculations.UserInput.second;

/**
 * Created by anthonycapriotti on 1/16/17.
 */
public class OperatorSwitch {
    static Calculations calculations = new Calculations();

    public static void operatorSwitch(String choice){

        switch (choice){
            case "Add":
                calculations.addition(first, second);
                break;
            case "Subtract":
                calculations.subtraction(first, second);
                break;
            case "Multiply":
                calculations.multiplication(first, second);
                break;
            case "Divide":
                calculations.division(first, second);
                break;
            case "Exponent":
                calculations.exponent(first, second);
                break;

        }
    }

}
