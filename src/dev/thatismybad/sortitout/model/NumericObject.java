package dev.thatismybad.sortitout.model;

import dev.thatismybad.sortitout.enums.Sort;

public abstract class NumericObject {

    private final Sort[] sortsToTest = {Sort.SELECTION, Sort.BUBBLE};

    public NumericObject() {
        test();
    }

    public void test() {
        for (Sort sort : sortsToTest) {
            testAllNumbers(sort);
            testAllPositiveNumbers(sort);
            testAllNegativeNumbers(sort);
        }
    }

    public abstract void testAllNumbers(Sort sort);

    public abstract void testAllPositiveNumbers(Sort sort);

    public abstract void testAllNegativeNumbers(Sort sort);

}