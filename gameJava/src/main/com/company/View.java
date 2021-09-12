package main.com.company;

import java.util.List;

/**
 * Created by User on 17.03.2016.
 */
public class View {
    // Text's constants
    public static final String INPUT_NUMBER_FROM_USER = "Input number from this range ";
    public static final String NOT_THE_RIGHT_NUMBER = "You didn't guess. ";
    public static final String RIGHT_NUMBER = "You guessed number right, the number is ";
    public static final String NUMBER_IS_NOT_FROM_RANGE = "Number is not from range. ";
    public static final String INPUT_IS_NOT_A_NUMBER = "Input is not a number ";
    public static final String OUTPUT_ATTEMPTS = "There are your attempts: ";
    public static final String NUMBER_IS_LESS= "The number is less than yours.";
    public static final String NUMBER_IS_GREATER = "The number is greater than yours.";









    public void printMessage(String message) {
        System.out.println(message);
    }

    public void print2Messages(String message, String message2) {
        System.out.println(message + " " + message2);
    }

    public void print3Messages(String message, String message2, String message3) {
        System.out.println(message + " " + message2 + " " + message3);
    }




    public void printStatistics(String message, List<Integer> arrayList) {
        System.out.print(message);
        System.out.println(arrayList);

    }


    public void printMessageAndGuessedNumber(String message, int number) {
        System.out.println(message + number);
    }



}
