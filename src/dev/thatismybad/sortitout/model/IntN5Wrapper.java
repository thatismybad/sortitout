package dev.thatismybad.sortitout.model;

import dev.thatismybad.sortitout.enums.Sign;

public class IntN5Wrapper extends IntNWrapper {
    private final IntN4Wrapper value;

    public IntN5Wrapper(Sign sign) {
        this.value = new IntN4Wrapper(sign);
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
        IntNWrapper[] array = new IntN5Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN5Wrapper(Sign.NEUTRAL);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generatePositiveValues(int n) {
        IntNWrapper[] array = new IntN5Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN5Wrapper(Sign.POSITIVE);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generateNegativeValues(int n) {
        IntNWrapper[] array = new IntN5Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN5Wrapper(Sign.NEGATIVE);
        }
        return array;
    }
}
