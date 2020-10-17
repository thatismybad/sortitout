package dev.thatismybad.sortitout.test;


import dev.thatismybad.sortitout.enums.Sort;
import dev.thatismybad.sortitout.model.NumericObject;

public class ObjectInteger extends NumericObject {

    public ObjectInteger() {
        super();
    }

    @Override
    public void test() {
        System.out.println("Class: " + this.getClass().getSimpleName());
    }

    @Override
    public void testAllNumbers(Sort sort) {

    }

    @Override
    public void testAllPositiveNumbers(Sort sort) {

    }

    @Override
    public void testAllNegativeNumbers(Sort sort) {

    }
}

