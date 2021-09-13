package main.com.company;

import java.util.Scanner;


public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.generateRandomNumber();

        int enteredNumber = inputIntValueWithScanner(sc);

        while (!model.isNumberCorrespondsToGuessed(enteredNumber)) {
            defineNewAttemptBounds(enteredNumber);
            enteredNumber = inputIntValueWithScanner(sc);

        }

        view.printMessageAndGuessedNumber(view.RIGHT_NUMBER, model.getRandomNumber());
        view.printStatistics(view.OUTPUT_ATTEMPTS, model.getAttempts());



    }



    private int inputIntValueWithScanner(Scanner sc) {
        String currentRange = getInputRange();
        view.print2Messages(View.INPUT_NUMBER_FROM_USER, currentRange);

        int enteredNumber;

        while (true) {
            while (!sc.hasNextInt()) {
                view.print3Messages(view.INPUT_IS_NOT_A_NUMBER, view.INPUT_NUMBER_FROM_USER, currentRange);
                sc.next();
            }

            enteredNumber = sc.nextInt();

            if (!model.isNumberAppropriate(enteredNumber)) {
                view.print3Messages(view.NUMBER_IS_NOT_FROM_RANGE, view.INPUT_NUMBER_FROM_USER, currentRange);
                model.addAttempt(enteredNumber);
            } else {
                model.addAttempt(enteredNumber);
                break;
            }
        }
        return enteredNumber;
    }


    public void defineNewAttemptBounds(int numberFromUser) {
        view.printMessage(view.NOT_THE_RIGHT_NUMBER);
        int result = model.checkEnteredNumber(numberFromUser);
        if (result == 2) {
            view.printMessage(view.NUMBER_IS_LESS);
        } else if (result == 1) {
            view.printMessage(view.NUMBER_IS_GREATER);

        }

    }



    String getInputRange() {
        return "(" + model.getLowerBound() + "; " + model.getUpperBound() + ")";
    }
}

