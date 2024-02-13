package org.example.domain;

public class Delimiter {
    private String value;

    public Delimiter(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean match(String matchString) {
        return value.equals(matchString);
    }
}
