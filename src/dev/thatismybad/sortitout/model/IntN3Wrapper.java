package dev.thatismybad.sortitout.model;

import dev.thatismybad.sortitout.enums.Sign;

public class IntN3Wrapper extends IntNWrapper {
    private final IntN2Wrapper value;

    public IntN3Wrapper(Sign sign) {
        this.value = new IntN2Wrapper(sign);
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
        IntNWrapper[] array = new IntN3Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN3Wrapper(Sign.NEUTRAL);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generatePositiveValues(int n) {
        IntNWrapper[] array = new IntN3Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN3Wrapper(Sign.POSITIVE);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generateNegativeValues(int n) {
        IntNWrapper[] array = new IntN3Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN3Wrapper(Sign.NEGATIVE);
        }
        return array;
    }
}
