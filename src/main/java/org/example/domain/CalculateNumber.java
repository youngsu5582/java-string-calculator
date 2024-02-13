package org.example.domain;

public class CalculateNumber {
    private Long value;

    public CalculateNumber(Long value) {
        this.value = value;
    }

    public CalculateNumber(Integer value) {
        this.value = Long.valueOf(value);
    }
    public Long getValue() {
        return value;
    }

    public CalculateNumber add(CalculateNumber calculateNumber) {
        return new CalculateNumber(this.value + calculateNumber.getValue());
    }
}
