package com.herokuapp.springboot.domain;

public enum UserField {
    USER_NAME("username");

    UserField(String field) {
        this.field = field;
    }

    private final String field;

    public String getField() {
        return field;
    }
}
