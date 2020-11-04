package dev.thatismybad.sortitout.model;

import dev.thatismybad.sortitout.enums.Sign;

public class IntN10Wrapper extends IntNWrapper {
    private final IntN9Wrapper value;

    public IntN10Wrapper(Sign sign) {
        this.value = new IntN9Wrapper(sign);
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
        IntNWrapper[] array = new IntN10Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN10Wrapper(Sign.NEUTRAL);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generatePositiveValues(int n) {
        IntNWrapper[] array = new IntN10Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN10Wrapper(Sign.POSITIVE);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generateNegativeValues(int n) {
        IntNWrapper[] array = new IntN10Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN10Wrapper(Sign.NEGATIVE);
        }
        return array;
    }
}
