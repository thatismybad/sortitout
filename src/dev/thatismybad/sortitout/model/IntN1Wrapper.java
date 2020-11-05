package dev.thatismybad.sortitout.model;

import dev.thatismybad.sortitout.enums.Sign;

import java.util.Random;

public class IntN1Wrapper extends IntNWrapper {
    private final int value;

    public IntN1Wrapper() {
        this.value = new Random().nextInt();
    }

    public IntN1Wrapper(int value) {
        this.value = value;
    }

    public IntN1Wrapper(Sign sign) {
        switch (sign) {
            case POSITIVE:
                this.value = Math.abs(new Random().nextInt());
                break;
            case NEGATIVE:
                this.value = Math.abs(new Random().nextInt()) * -1;
                break;
            default:
                this.value = new Random().nextInt();
                break;
        }
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public IntNWrapper[] generateValues(int n) {
        IntNWrapper[] array = new IntN1Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN1Wrapper(Sign.NEUTRAL);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generatePositiveValues(int n) {
        IntNWrapper[] array = new IntN1Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN1Wrapper(Sign.POSITIVE);
        }
        return array;
    }

    @Override
    public IntNWrapper[] generateNegativeValues(int n) {
        IntNWrapper[] array = new IntN1Wrapper[n];
        for (int i = 0; i < n; i++) {
            array[i] = new IntN1Wrapper(Sign.NEGATIVE);
        }
        return array;
    }
}
