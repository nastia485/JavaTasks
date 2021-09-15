package com.company.controller;

import com.company.model.*;
import com.company.view.View;


import java.util.Scanner;

import static com.company.controller.RegexContainer.*;
import static com.company.view.TextConstant.*;
import static com.company.view.View.*;
import static com.company.view.View.FIRST_NOTE;


public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void startProgram() {
        Scanner scanner = new Scanner(System.in);
        printMessage(FIRST_NOTE);
        do {
            inputData(scanner);
        } while (doesUserWantToContinue(scanner));
    }

    public void inputData(Scanner scanner) {
        Scanner sc = new Scanner(System.in);
        Note note = new Note();
        Address address = new Address();
        InputController inputController =
                new InputController(sc, view);

        String str1 = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_EN;

        note.setFirstName(inputController.inputStringValueWithScanner(FIRST_NAME, str1));

        String enteredLogin = inputController.inputStringValueWithScanner(LOGIN, REGEX_LOGIN_UNI);

        while (true) {
            try {
                checkLoginAlreadyExists(enteredLogin);
            } catch (LoginAlreadyExistsException e) {
                printMessage(concatenationString(LOGIN_EXISTS, enteredLogin, LOGIN_INPUT));
                enteredLogin = inputController.inputStringValueWithScanner(LOGIN, REGEX_LOGIN_UNI);
                continue;
            }
            note.setLogin(enteredLogin);
            break;
        }


        /* String str2 = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_SURNAME_UKR : REGEX_SURNAME_EN;

        note.setSecondName(inputController.inputStringValueWithScanner(SURNAME, str2));

        note.setPatronymic(inputController.inputStringValueWithScanner(PATRONYMIC,REGEX_PATRONYMIC_UKR));

        String str3 = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_COMMENT_UKR : REGEX_COMMENT_EN;

        note.setComment(inputController.inputStringValueWithScanner(COMMENT,str3));

        String str4 = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_GROUP_UKR : REGEX_GROUP_EN;

        String enteredGroup = inputController.inputStringValueWithScanner(GROUP, str4);

        for (int i = 0; i < Group.values().length; i++) {
            Group group = Group.values()[i];
            if (group.getValue().equals(enteredGroup)) {
                note.setGroup(group);
                break;
            }
        }

        note.setHomePhoneNumber(inputController.inputStringValueWithScanner(HOME_NUMBER,REGEX_HOME_NUMBER_UNI));

        note.setMobPhoneNumber(inputController.inputStringValueWithScanner(MOBILE_NUMBER_1,REGEX_MOBILE_NUMBER_UNI));

        note.setMobPhoneNumber2(inputController.inputStringValueWithScanner(MOBILE_NUMBER_2,REGEX_MOBILE2_NUMBER_UNI));

        note.setEmail(inputController.inputStringValueWithScanner(EMAIL,REGEX_EMAIL_UNI));

        note.setSkype(inputController.inputStringValueWithScanner(SKYPE, REGEX_SKYPE_UNI));

        address.setIndex(inputController.inputStringValueWithScanner(INDEX, REGEX_INDEX_UNI));

        String str5 = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_CITY_UKR : REGEX_CITY_EN;

        address.setCity(inputController.inputStringValueWithScanner(CITY,str5));

        String str6 = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_STREET_UKR : REGEX_STREET_EN;

        address.setStreet(inputController.inputStringValueWithScanner(STREET, str6));

        address.setHouseNumber(inputController.inputStringValueWithScanner(HOUSE_NUMBER, REGEX_HOUSE_NUMBER_UNI));

        address.setFlatNumber(inputController.inputStringValueWithScanner(FLAT_NUMBER, REGEX_FLAT_NUMBER_UNI));

        note.setDateOfEntering(inputController.inputStringValueWithScanner(DATE_OF_ENTRY, REGEX_DATE_UNI));

        note.setDateOfChange(inputController.inputStringValueWithScanner(DATE_OF_CHANGE, REGEX_DATE_UNI));

        note.setAddress(address);

        note.setAddressString(address.toString());

         */

        model.addNote(note);

    }

    public void checkLoginAlreadyExists(String enteredLogin) throws LoginAlreadyExistsException {
        for (int i = 0; i < model.notes.size(); i++) {
            if (enteredLogin.equals(model.getLoginFromCertainNote(i))) {
                throw new LoginAlreadyExistsException();
            } else {
                continue;
            }
        }
    }


    public boolean doesUserWantToContinue(Scanner sc) {
        printMessage(QUESTION_TO_USER);
        String answer = sc.next();
        while (!answer.equals("Yes") && !answer.equals("No")) {
            printMessage(COMMAND_TO_CONTINUE_ENTERING);
            answer = sc.next();
        }
        return answer.equals("Yes");
    }
}
