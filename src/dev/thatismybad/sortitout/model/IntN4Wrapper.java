package dev.thatismybad.sortitout.model;

import dev.thatismybad.sortitout.enums.Sign;

public class IntN4Wrapper extends IntNWrapper {
    private final IntN3Wrapper value;

    public IntN4Wrapper(Sign sign) {
        this.value = new IntN3Wrapper(sign);
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
        IntNWrapper[] array = new IntN4Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN4Wrapper(Sign.NEUTRAL);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generatePositiveValues(int n) {
        IntNWrapper[] array = new IntN4Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN4Wrapper(Sign.POSITIVE);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generateNegativeValues(int n) {
        IntNWrapper[] array = new IntN4Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN4Wrapper(Sign.NEGATIVE);
        }
        return array;
    }
}
