package dev.thatismybad.sortitout.model;

import dev.thatismybad.sortitout.enums.Sign;

public class IntN9Wrapper extends IntNWrapper {
    private final IntN8Wrapper value;

    public IntN9Wrapper(Sign sign) {
        this.value = new IntN8Wrapper(sign);
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
        IntNWrapper[] array = new IntN9Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN9Wrapper(Sign.NEUTRAL);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generatePositiveValues(int n) {
        IntNWrapper[] array = new IntN9Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN9Wrapper(Sign.POSITIVE);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generateNegativeValues(int n) {
        IntNWrapper[] array = new IntN9Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN9Wrapper(Sign.NEGATIVE);
        }
        return array;
    }
}
