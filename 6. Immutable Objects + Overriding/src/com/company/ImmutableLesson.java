package com.company;

public final class ImmutableLesson {

    private final int i;
    Object object;

    public ImmutableLesson(int i) {
        this.i = i;
    }

    public int getI(){
        return i;
    }

}