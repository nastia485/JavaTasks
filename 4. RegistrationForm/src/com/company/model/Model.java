package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Model {

    public List <Note> notes = new ArrayList<>();

    public String getLoginFromCertainNote(int index) {
        return notes.get((index)).getLogin();
    }

    public void addNote(Note note) {
        notes.add(notes.size(), note);
    }


}