package com.example.homework34;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Person implements Serializable {
    String name, profession, surname;
    int age;

    public Person(String name, String profession, String surname, int age) {
        this.name = name;
        this.profession = profession;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @NonNull
    @Override
    public String toString() {
        return "Person name: " + getName() + ";   " + "profession: " +getProfession() + ";  лет:  "+getAge();
    }
}
