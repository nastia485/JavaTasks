package com.company;

import com.company.view.View;
import com.company.controller.Controller;
import com.company.model.Model;

public class Main {

    public static void main(String[] args) {

            Controller controller = new Controller(new View(), new Model());

            controller.processUser();
    }
}



