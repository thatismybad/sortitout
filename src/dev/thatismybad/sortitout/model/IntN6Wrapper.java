package dev.thatismybad.sortitout.model;

import dev.thatismybad.sortitout.enums.Sign;

public class IntN6Wrapper extends IntNWrapper {
    private final IntN5Wrapper value;

    public IntN6Wrapper(Sign sign) {
        this.value = new IntN5Wrapper(sign);
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
        IntNWrapper[] array = new IntN6Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN6Wrapper(Sign.NEUTRAL);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generatePositiveValues(int n) {
        IntNWrapper[] array = new IntN6Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN6Wrapper(Sign.POSITIVE);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generateNegativeValues(int n) {
        IntNWrapper[] array = new IntN6Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN6Wrapper(Sign.NEGATIVE);
        }
        return array;
    }
}
