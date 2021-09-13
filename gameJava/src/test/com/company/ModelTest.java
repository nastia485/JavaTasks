package test.com.company;

import main.com.company.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ModelTest {

    private final Model model = new Model();

    @BeforeEach
    public void before(){
        model.generateRandomNumber();
    }

    @Test
    public void testisNumberCorrespondsToGuessed_success(){
        int generated = model.getRandomNumber();

        boolean actual = model.isNumberCorrespondsToGuessed(generated);
        Assertions.assertTrue(actual);
    }

    @Test
    public void testisNumberCorrespondsToGuessed_notGuessed(){
        boolean actual = model.isNumberCorrespondsToGuessed(110);
        Assertions.assertFalse(actual);
    }

    @Test
    public void testCheckEnteredNumber_enteredMoreThanGenerated(){
        int generated = model.getRandomNumber();

        int actual = model.checkEnteredNumber(generated + 1);
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void testCheckEnteredNumber_enteredLessThanGenerated(){
        int generated = model.getRandomNumber();

        int actual = model.checkEnteredNumber(generated - 1);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testCheckEnteredNumber_upperBoundChanged(){
        int generated = model.getRandomNumber();
        int numberFromUser = generated + 1;

        model.checkEnteredNumber(numberFromUser);
        Assertions.assertEquals(numberFromUser, model.getUpperBound());
    }

    @Test
    public void testCheckEnteredNumber_lowerBoundChanged(){
        int generated = model.getRandomNumber();
        int numberFromUser = generated - 1;

        model.checkEnteredNumber(numberFromUser);
        Assertions.assertEquals(numberFromUser, model.getLowerBound());
    }

    @Test
    public void testisNumberAppropriate_numberFromUserIsOutOfRangeBecauseGreater() {
        int numberFromUser = model.getUpperBound()+1;
        boolean actual = model.isNumberAppropriate(numberFromUser);
        Assertions.assertFalse(actual);
    }


    @Test
    public void testisNumberAppropriate_numberFromUserIsOutOfRangeBecauseLess() {
        int numberFromUser = model.getLowerBound()-1;
        boolean actual = model.isNumberAppropriate(numberFromUser);
        Assertions.assertFalse(actual);
    }

    @Test
    public void testisNumberAppropriate_numberIsAppropriate() {
        int numberFromUser = model.getUpperBound()-model.getLowerBound()-1;
        boolean actual = model.isNumberAppropriate(numberFromUser);
        Assertions.assertTrue(actual);

    }

}
