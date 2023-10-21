package ru.shapov.springlab.models;

public enum GenderEnum {
    MAN("Мужчина"),
    WOMAN("Женщина");

    private String name;

    GenderEnum(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
