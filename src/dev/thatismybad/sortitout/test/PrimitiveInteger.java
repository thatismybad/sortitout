package dev.thatismybad.sortitout.test;

import dev.thatismybad.sortitout.App;
import dev.thatismybad.sortitout.enums.Sort;
import dev.thatismybad.sortitout.model.DataLog;
import dev.thatismybad.sortitout.model.NumericObject;
import dev.thatismybad.sortitout.utils.FileUtils;
import dev.thatismybad.sortitout.utils.MeasureUtils;
import dev.thatismybad.sortitout.utils.NumberUtils;
import dev.thatismybad.sortitout.utils.sorter.BubbleSorter;
import dev.thatismybad.sortitout.utils.sorter.SelectionSorter;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveInteger extends NumericObject {

    public PrimitiveInteger() {
        super();
        MeasureUtils.println("Class: " + this.getClass().getSimpleName());
    }

    @Override
    public void testAllNumbers(Sort sort) {
        List<DataLog> logs = new ArrayList<>();
        for (int i = 0; i < App.REPETITIONS; i++) {
            DataLog dataLog = new DataLog()
                    .setId(i + 1)
                    .setDataType("int")
                    .setNumberOfValues(App.NUMBERS_TO_GENERATE);
            MeasureUtils.measureIt(sortAllNumbers(sort, generateAllNumbers()), dataLog);
            logs.add(dataLog);
        }
        for (DataLog log : logs) {
            MeasureUtils.println(log);
        }
        FileUtils.writeToFile("int", sort, logs);
    }

    @Override
    public void testAllPositiveNumbers(Sort sort) {
        List<DataLog> logs = new ArrayList<>();
        for (int i = 0; i < App.REPETITIONS; i++) {
            DataLog dataLog = new DataLog()
                    .setId(i + 1)
                    .setDataType("int")
                    .setNumberOfValues(App.NUMBERS_TO_GENERATE);
            MeasureUtils.measureIt(sortAllNumbers(sort, generateAllPositiveNumbers()), dataLog);
            logs.add(dataLog);
        }
        for (DataLog log : logs) {
            MeasureUtils.println(log);
        }
        FileUtils.writeToFile("int_positive", sort, logs);
    }

    @Override
    public void testAllNegativeNumbers(Sort sort) {
        List<DataLog> logs = new ArrayList<>();
        for (int i = 0; i < App.REPETITIONS; i++) {
            DataLog dataLog = new DataLog()
                    .setId(i + 1)
                    .setDataType("int")
                    .setNumberOfValues(App.NUMBERS_TO_GENERATE);
            MeasureUtils.measureIt(sortAllNumbers(sort, generateAllNegativeNumbers()), dataLog);
            logs.add(dataLog);
        }
        for (DataLog log : logs) {
            MeasureUtils.println(log);
        }
        FileUtils.writeToFile("int_negative", sort, logs);
    }

    public int[] generateAllNumbers() {
        int[] numbers = NumberUtils.generatePrimitiveIntegers(App.NUMBERS_TO_GENERATE);
        NumberUtils.printPrimitiveIntArray(numbers);
        return numbers;
    }

    public int[] generateAllPositiveNumbers() {
        int[] numbers = NumberUtils.makeAllPositive(NumberUtils.generatePrimitiveIntegers(App.NUMBERS_TO_GENERATE));
        NumberUtils.printPrimitiveIntArray(numbers);
        return numbers;
    }

    public int[] generateAllNegativeNumbers() {
        int[] numbers = NumberUtils.makeAllNegative(NumberUtils.generatePrimitiveIntegers(App.NUMBERS_TO_GENERATE));
        NumberUtils.printPrimitiveIntArray(numbers);
        return numbers;
    }

    public Runnable sortAllNumbers(Sort type, int[] array) {
        MeasureUtils.println("method: testAllNumbers");
        return () -> {
            switch (type) {
                case SELECTION:
                    new SelectionSorter().sort(array);
                    break;
                case BUBBLE:
                    new BubbleSorter().sort(array);
                default:
                    break;
            }
            NumberUtils.printPrimitiveIntArray(array);
        };
    }
}
