package dev.thatismybad.sortitout.utils.sorter;

public class BubbleSorter implements Sorter {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    @Override
    public void sort(float[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {

                    float temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    @Override
    public void sort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {

                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    @Override
    public void sort(long[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    long temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    @Override
    public void sort(Integer[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {

                    Integer temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    @Override
    public void sort(Float[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {

                    Float temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    @Override
    public void sort(Double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {

                    Double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    @Override
    public void sort(Long[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {

                    Long temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
}
