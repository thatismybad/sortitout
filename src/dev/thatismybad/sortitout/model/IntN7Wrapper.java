package dev.thatismybad.sortitout.model;

import dev.thatismybad.sortitout.enums.Sign;

public class IntN7Wrapper extends IntNWrapper {
    private final IntN6Wrapper value;

    public IntN7Wrapper(Sign sign) {
        this.value = new IntN6Wrapper(sign);
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
        IntNWrapper[] array = new IntN7Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN7Wrapper(Sign.NEUTRAL);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generatePositiveValues(int n) {
        IntNWrapper[] array = new IntN7Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN7Wrapper(Sign.POSITIVE);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generateNegativeValues(int n) {
        IntNWrapper[] array = new IntN7Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN7Wrapper(Sign.NEGATIVE);
        }
        return array;
    }
}
