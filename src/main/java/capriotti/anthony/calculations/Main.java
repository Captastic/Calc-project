package capriotti.anthony.calculations;

import sun.tools.jstat.Operator;

import static capriotti.anthony.calculations.UserInput.*;

/**
 * Created by anthonycapriotti on 1/16/17.
 */
public class Main {
    public static void main (String[] args){
        UserInput userInput = new UserInput();

        userInput.input();
        OperatorSwitch.operatorSwitch(operator);
        System.out.println(answer);


    }
}
