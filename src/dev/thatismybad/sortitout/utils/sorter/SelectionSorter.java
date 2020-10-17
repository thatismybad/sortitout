package dev.thatismybad.sortitout.utils.sorter;

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
}
