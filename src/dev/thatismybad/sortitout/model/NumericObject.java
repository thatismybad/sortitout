package dev.thatismybad.sortitout.model;

import dev.thatismybad.sortitout.enums.Sort;
import dev.thatismybad.sortitout.utils.MeasureUtils;

public abstract class NumericObject {

    private final Sort[] sortsToTest = {Sort.SELECTION, Sort.BUBBLE};

    public NumericObject() {
        test();
    }

    public void test() {
        long totalStart = System.currentTimeMillis();
        long testStart, testEnd;
        MeasureUtils.printTime("Tests started", totalStart);
        for (Sort sort : sortsToTest) {
            testStart = System.currentTimeMillis();
            MeasureUtils.printTime("Test [start] - all numbers", testStart);
            testAllNumbers(sort);
            testEnd = System.currentTimeMillis();
            MeasureUtils.printTime("Test [end] - all numbers", testEnd);
            MeasureUtils.printTimeDiff("Time of tests - all numbers", testStart, testEnd);
            MeasureUtils.println("------------------------------", true);
            testStart = System.currentTimeMillis();
            MeasureUtils.printTime("Test [start] - all positive numbers", testStart);
            testAllPositiveNumbers(sort);
            testEnd = System.currentTimeMillis();
            MeasureUtils.printTime("Test [end] - all positive numbers", testEnd);
            MeasureUtils.printTimeDiff("Time of tests - all positive numbers", testStart, testEnd);
            MeasureUtils.println("------------------------------", true);
            testStart = System.currentTimeMillis();
            MeasureUtils.printTime("Test [start] - all negative numbers", testStart);
            testAllNegativeNumbers(sort);
            testEnd = System.currentTimeMillis();
            MeasureUtils.printTime("Test [end] - all negative numbers", testEnd);
            MeasureUtils.printTimeDiff("Time of tests - all negative numbers", testStart, testEnd);
            MeasureUtils.println("\n", true);
        }
        long totalEnd = System.currentTimeMillis();
        MeasureUtils.printTime("Tests ended", totalEnd);
        MeasureUtils.printTimeDiff("Total time of tests", totalStart, totalEnd);
    }

    public abstract void testAllNumbers(Sort sort);

    public abstract void testAllPositiveNumbers(Sort sort);

    public abstract void testAllNegativeNumbers(Sort sort);

}