package dev.thatismybad.sortitout.model;

import dev.thatismybad.sortitout.enums.Sign;

public class IntN8Wrapper extends IntNWrapper {
    private final IntN7Wrapper value;

    public IntN8Wrapper(Sign sign) {
        this.value = new IntN7Wrapper(sign);
    }

    public int getValue() {
        return value.getValue();
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public IntNWrapper[] generateValues(int n) {
        IntNWrapper[] array = new IntN8Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN8Wrapper(Sign.NEUTRAL);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generatePositiveValues(int n) {
        IntNWrapper[] array = new IntN8Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN8Wrapper(Sign.POSITIVE);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generateNegativeValues(int n) {
        IntNWrapper[] array = new IntN8Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN8Wrapper(Sign.NEGATIVE);
        }
        return array;
    }
}
