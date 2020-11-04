package dev.thatismybad.sortitout.utils.sorter;

import dev.thatismybad.sortitout.model.*;

public class SelectionSorter implements Sorter {

    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(float[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            float temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            double temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(long[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            long temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(Integer[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            Integer temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(Float[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            Float temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(Double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            Double temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(Long[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            Long temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(IntN1Wrapper[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j].getValue() < array[min_idx].getValue())
                    min_idx = j;
            IntN1Wrapper temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(IntN2Wrapper[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j].getValue() < array[min_idx].getValue())
                    min_idx = j;
            IntN2Wrapper temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(IntN3Wrapper[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j].getValue() < array[min_idx].getValue())
                    min_idx = j;
            IntN3Wrapper temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(IntN4Wrapper[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j].getValue() < array[min_idx].getValue())
                    min_idx = j;
            IntN4Wrapper temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(IntN5Wrapper[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j].getValue() < array[min_idx].getValue())
                    min_idx = j;
            IntN5Wrapper temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(IntN6Wrapper[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j].getValue() < array[min_idx].getValue())
                    min_idx = j;
            IntN6Wrapper temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(IntN7Wrapper[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j].getValue() < array[min_idx].getValue())
                    min_idx = j;
            IntN7Wrapper temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(IntN8Wrapper[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j].getValue() < array[min_idx].getValue())
                    min_idx = j;
            IntN8Wrapper temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(IntN9Wrapper[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j].getValue() < array[min_idx].getValue())
                    min_idx = j;
            IntN9Wrapper temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void sort(IntN10Wrapper[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j].getValue() < array[min_idx].getValue())
                    min_idx = j;
            IntN10Wrapper temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }
}
