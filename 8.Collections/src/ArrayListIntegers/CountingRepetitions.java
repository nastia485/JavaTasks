package ArrayListIntegers;

import java.util.*;

public class CountingRepetitions{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(-3);
        numbers.add(1);
        numbers.add(-3);
        numbers.add(1);
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);

        numbers.stream().distinct().forEach( s -> System.out.println(s + " " + Collections.frequency(numbers, s)));

    }

}
