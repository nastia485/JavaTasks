package com.company;

public final class ImmutableCat {
    private String breed;
    private String eyeColor;

    public ImmutableCat(String breed, String eyeColor)
    {
        this.breed = breed;
        this.eyeColor = eyeColor;
        System.out.println("New cat created! It is " + this.breed + " and has " + this.eyeColor + " eyes!");
    }

    public ImmutableCat setBreed(String breed)
    {
        ImmutableCat c = new ImmutableCat(breed, this.eyeColor);
        return c;
    }

    public ImmutableCat setEyeColor(String eyeColor)
    {
        ImmutableCat c = new ImmutableCat(this.breed, eyeColor);
        return c;
    }
}

class Test{

    public static void main(String [] args)
    {
        ImmutableCat first = new ImmutableCat("Bengal", "green");

        ImmutableCat second = first.setBreed("Sphynx");
    }
}

