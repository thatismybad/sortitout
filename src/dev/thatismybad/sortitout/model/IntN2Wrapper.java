package dev.thatismybad.sortitout.model;

import dev.thatismybad.sortitout.enums.Sign;

public class IntN2Wrapper extends IntNWrapper {
    private final IntN1Wrapper value;

    public IntN2Wrapper(int value) {
        this.value = new IntN1Wrapper(value);
    }

    public IntN2Wrapper(Sign sign) {
        this.value = new IntN1Wrapper(sign);
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
        IntNWrapper[] array = new IntN2Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN2Wrapper(Sign.NEUTRAL);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generatePositiveValues(int n) {
        IntNWrapper[] array = new IntN2Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN2Wrapper(Sign.POSITIVE);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generateNegativeValues(int n) {
        IntNWrapper[] array = new IntN2Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN2Wrapper(Sign.NEGATIVE);
        }
        return array;
    }
}
