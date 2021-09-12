package main.com.company;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int upperBound = 100;
    private int lowerBound = 0;
    private int randomNumber;

    private List<Integer> attempts = new ArrayList<>();

    public void generateRandomNumber() {
        randomNumber = (int)Math.ceil(Math.random()*
                (upperBound - lowerBound - 1) + lowerBound);
    }

    public int checkEnteredNumber (int numberFromUser) {
        if (numberFromUser > randomNumber) {
            upperBound = numberFromUser;
            return 2;
        } else {
            lowerBound = numberFromUser;
            return 1;
        }
    }

   public boolean isNumberAppropriate(int numberFromUser) {
        return numberFromUser < getUpperBound() && numberFromUser > getLowerBound();
    }


    public boolean isNumberCorrespondsToGuessed(int numberFromUser) {
        return numberFromUser == randomNumber;
    }

    public int getRandomNumber(){return randomNumber;}
    public int getUpperBound(){return upperBound;}
    public int getLowerBound(){return lowerBound;}
    public List<Integer> getAttempts(){return attempts;}

    public void addAttempt(int attempt) {
        attempts.add(attempt);
    }


}
