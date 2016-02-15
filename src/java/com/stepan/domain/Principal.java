package com.stepan.domain;

/**
 * Created by Michal on 15.2.2016.
 */
public class Principal {

    private String name;
    private String surname;

    public Principal(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
