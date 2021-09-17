package com.company;

public class Accumulator implements PartOfCar{

    private Dimension dimension;

    public Accumulator(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public Dimension dimension() {
        return dimension;
    }

    public enum Dimension{
        SMALL, MEDIUM, LARGE
    }

    public String toString() {
        return "{Accumulator: dimension = " + dimension +"}";
    }
}
