package com.company.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.company.view.TextConstant.INPUT_STRING_DATA;
import static com.company.view.TextConstant.WRONG_INPUT_DATA;


public class View {

    public static final String LOGIN_EXISTS = "This login already exists: ";

    public static final String LOGIN_INPUT = ". Please create new unique login";

    public static final String QUESTION_TO_USER = "Do you want to create another note?";

    public static final String COMMAND_TO_CONTINUE_ENTERING = "Please enter \"Yes\" or \"No\"";

    public static final String FIRST_NOTE = "Please start to enter data in first note";

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));



    public static void printMessage(String message){
        System.out.println(message);
    }

    public static String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(

                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

}
