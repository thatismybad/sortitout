package dev.thatismybad.sortitout.test;

import dev.thatismybad.sortitout.App;
import dev.thatismybad.sortitout.enums.Sign;
import dev.thatismybad.sortitout.enums.Sort;
import dev.thatismybad.sortitout.model.DataLog;
import dev.thatismybad.sortitout.model.IntN4Wrapper;
import dev.thatismybad.sortitout.model.NumericObject;
import dev.thatismybad.sortitout.utils.FileUtils;
import dev.thatismybad.sortitout.utils.MeasureUtils;
import dev.thatismybad.sortitout.utils.NumberUtils;
import dev.thatismybad.sortitout.utils.sorter.BubbleSorter;
import dev.thatismybad.sortitout.utils.sorter.SelectionSorter;

import java.util.ArrayList;
import java.util.List;

public class IntN4Array extends NumericObject {
    public IntN4Array() {
        super();
        MeasureUtils.println("Class: " + this.getClass().getSimpleName());
    }

    @Override
    public void testAllNumbers(Sort sort) {
        List<DataLog> logs = new ArrayList<>();
        for (int i = 0; i < App.REPETITIONS; i++) {
            DataLog dataLog = new DataLog()
                    .setId(i + 1)
                    .setDataType("IntN4")
                    .setNumberOfValues(App.NUMBERS_TO_GENERATE);
            MeasureUtils.measureIt(sortAllNumbers(sort, generateAllNumbers(App.NUMBERS_TO_GENERATE)), dataLog);
            logs.add(dataLog);
        }
        for (DataLog log : logs) {
            MeasureUtils.println(log);
        }
        FileUtils.writeToFile("IntN4", sort, logs);
    }

    @Override
    public void testAllPositiveNumbers(Sort sort) {
        List<DataLog> logs = new ArrayList<>();
        for (int i = 0; i < App.REPETITIONS; i++) {
            DataLog dataLog = new DataLog()
                    .setId(i + 1)
                    .setDataType("IntN4")
                    .setNumberOfValues(App.NUMBERS_TO_GENERATE);
            MeasureUtils.measureIt(sortAllNumbers(sort, generateAllPositiveNumbers(App.NUMBERS_TO_GENERATE)), dataLog);
            logs.add(dataLog);
        }
        for (DataLog log : logs) {
            MeasureUtils.println(log);
        }
        FileUtils.writeToFile("IntN4_positive", sort, logs);
    }

    @Override
    public void testAllNegativeNumbers(Sort sort) {
        List<DataLog> logs = new ArrayList<>();
        for (int i = 0; i < App.REPETITIONS; i++) {
            DataLog dataLog = new DataLog()
                    .setId(i + 1)
                    .setDataType("IntN4")
                    .setNumberOfValues(App.NUMBERS_TO_GENERATE);
            MeasureUtils.measureIt(sortAllNumbers(sort, generateAllNegativeNumbers(App.NUMBERS_TO_GENERATE)), dataLog);
            logs.add(dataLog);
        }
        for (DataLog log : logs) {
            MeasureUtils.println(log);
        }
        FileUtils.writeToFile("IntN4_negative", sort, logs);
    }

    public IntN4Wrapper[] generateAllNumbers(int n) {
        IntN4Wrapper[] numbers = (IntN4Wrapper[]) new IntN4Wrapper(Sign.NEUTRAL).generateValues(n);
        NumberUtils.printObjectArray(numbers);
        return numbers;
    }

    public IntN4Wrapper[] generateAllPositiveNumbers(int n) {
        IntN4Wrapper[] numbers = (IntN4Wrapper[]) new IntN4Wrapper(Sign.POSITIVE).generatePositiveValues(n);
        NumberUtils.printObjectArray(numbers);
        return numbers;
    }

    public IntN4Wrapper[] generateAllNegativeNumbers(int n) {
        IntN4Wrapper[] numbers = (IntN4Wrapper[]) new IntN4Wrapper(Sign.NEGATIVE).generateNegativeValues(n);
        NumberUtils.printObjectArray(numbers);
        return numbers;
    }

    public Runnable sortAllNumbers(Sort type, IntN4Wrapper[] array) {
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
            NumberUtils.printObjectArray(array);
        };
    }
}
