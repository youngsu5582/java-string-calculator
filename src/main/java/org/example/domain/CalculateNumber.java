package org.example.domain;

public class CalculateNumber {
    private Long value;

    public CalculateNumber(Long value) {
        validateCalculateNumber(value);
        this.value = value;
    }

    private void validateCalculateNumber(Long value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }
    }

    public CalculateNumber(Integer value) {
        this(Long.valueOf(value));
    }

    public Long getValue() {
        return value;
    }

    public CalculateNumber(String value) {
        this(Long.parseLong(value));
    }

    public CalculateNumber add(CalculateNumber calculateNumber) {
        return new CalculateNumber(this.value + calculateNumber.getValue());
    }
}
