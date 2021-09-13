package com.company.controller;


import com.company.view.View;

import java.util.Scanner;

public class InputController {
    private Scanner scanner;
    private View view;

    public InputController(Scanner scanner, View view) {
        this.scanner = scanner;
        scanner.useDelimiter("\n");
        this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }
}
