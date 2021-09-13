package com.company;

import java.util.Scanner;

import static com.company.View.DEFAULT_MESSAGE;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processInput() {
        Scanner scanner = new Scanner(System.in);
        handleString(scanner, model.getHello());
        handleString(scanner, model.getWorld());

    }

    private void handleString(Scanner scanner, String expectedString){
        view.printMessage(View.DEFAULT_MESSAGE + expectedString);
        scanner.next();
        while(!scanner.hasNext(expectedString)) {
            System.out.println("Wrong input, enter again");
            scanner.next();
        }
    }
}
