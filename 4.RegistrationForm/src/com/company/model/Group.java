package com.company.model;

public enum Group {
    RELATIVES("РОДИЧІ"),
    WORK("РОБОТА"),
    FRIENDS("ДРУЗІ");

    private final String value;

    private Group(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}



