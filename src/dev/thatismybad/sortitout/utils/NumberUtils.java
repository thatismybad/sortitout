package dev.thatismybad.sortitout.utils;

import dev.thatismybad.sortitout.enums.ObjectType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NumberUtils {

    public static int[] generatePrimitiveIntegers(int n) {
        return new Random().ints(n).toArray();
    }

    public static long[] generatePrimitiveLongs(int n) {
        return new Random().longs(n).toArray();
    }

    public static float[] generatePrimitiveFloats(int n) {
        float[] array = new float[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = r.nextFloat();
        }
        return array;
    }

    public static double[] generatePrimitiveDoubles(int n) {
        return new Random().doubles(n).toArray();
    }

    public static Integer[] generateObjectIntegers(int n) {
        int[] primitives = generatePrimitiveIntegers(n);
        Integer[] objects = new Integer[n];
        for (int i = 0; i < primitives.length; i++) {
            objects[i] = primitives[i];
        }
        return objects;
    }

    public static Long[] generateObjectLongs(int n) {
        long[] primitives = generatePrimitiveLongs(n);
        Long[] objects = new Long[n];
        for (int i = 0; i < primitives.length; i++) {
            objects[i] = primitives[i];
        }
        return objects;
    }

    public static Float[] generateObjectFloats(int n) {
        float[] primitives = generatePrimitiveFloats(n);
        Float[] objects = new Float[n];
        for (int i = 0; i < primitives.length; i++) {
            objects[i] = primitives[i];
        }
        return objects;
    }

    public static Double[] generateObjectDoubles(int n) {
        double[] primitives = generatePrimitiveDoubles(n);
        Double[] objects = new Double[n];
        for (int i = 0; i < primitives.length; i++) {
            objects[i] = primitives[i];
        }
        return objects;
    }

    public static List<?> generateObjectList(ObjectType type, int n) {
        switch (type) {
            case INTEGER:
                return Arrays.asList(generateObjectIntegers(n));
            case DOUBLE:
                return Arrays.asList(generateObjectDoubles(n));
            case FLOAT:
                return Arrays.asList(generateObjectFloats(n));
            case LONG:
                return Arrays.asList(generateObjectLongs(n));
            default:
                return null;
        }
    }

    public static void printPrimitiveIntArray(int[] array) {
        MeasureUtils.print("int[]: ");
        for (int num : array) {
            MeasureUtils.print(num + " ");
        }
        MeasureUtils.println();
    }

    public static void printPrimitiveFloatArray(float[] array) {
        MeasureUtils.print("float[]: ");
        for (float num : array) {
            MeasureUtils.print(num + " ");
        }
        MeasureUtils.println();
    }

    public static void printPrimitiveDoubleArray(double[] array) {
        MeasureUtils.print("double[]: ");
        for (double num : array) {
            MeasureUtils.print(num + " ");
        }
        MeasureUtils.println();
    }

    public static void printPrimitiveLongArray(long[] array) {
        MeasureUtils.print("long[]: ");
        for (long num : array) {
            MeasureUtils.print(num + " ");
        }
        MeasureUtils.println();
    }

    public static void printObjectArray(Object[] array) {
        MeasureUtils.print(String.format("%s: ", array.getClass().getSimpleName()));
        for (Object num : array) {
            MeasureUtils.print(num + " ");
        }
        MeasureUtils.println();
    }

    public static void printObjectList(List<?> list) {
        MeasureUtils.print(String.format("<%s>: ", list.get(0).getClass().getSimpleName()));
        for (Object num : list) {
            MeasureUtils.print(num + " ");
        }
        MeasureUtils.println();
    }

    public static int makeOnePositive(int num) {
        return Math.abs(num);
    }

    public static float makeOnePositive(float num) {
        return Math.abs(num);
    }

    public static double makeOnePositive(double num) {
        return Math.abs(num);
    }

    public static long makeOnePositive(long num) {
        return Math.abs(num);
    }

    public static Integer makeOnePositive(Integer num) {
        return Math.abs(num);
    }

    public static Float makeOnePositive(Float num) {
        return Math.abs(num);
    }

    public static Double makeOnePositive(Double num) {
        return Math.abs(num);
    }

    public static Long makeOnePositive(Long num) {
        return Math.abs(num);
    }

    public static int makeOneNegative(int num) {
        return Math.abs(num) * -1;
    }

    public static float makeOneNegative(float num) {
        return Math.abs(num) * -1;
    }


    public static double makeOneNegative(double num) {
        return Math.abs(num) * -1;
    }

    public static long makeOneNegative(long num) {
        return Math.abs(num) * -1;
    }

    public static Integer makeOneNegative(Integer num) {
        return Math.abs(num) * -1;
    }

    public static Float makeOneNegative(Float num) {
        return Math.abs(num) * -1;
    }

    public static Double makeOneNegative(Double num) {
        return Math.abs(num) * -1;
    }

    public static Long makeOneNegative(Long num) {
        return Math.abs(num) * -1;
    }

    public static int[] makeAllNegative(int[] array) {
        int[] negatives = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            negatives[i] = makeOneNegative(array[i]);
        }
        return negatives;
    }

    public static float[] makeAllNegative(float[] array) {
        float[] negatives = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            negatives[i] = makeOneNegative(array[i]);
        }
        return negatives;
    }

    public static double[] makeAllNegative(double[] array) {
        double[] negatives = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            negatives[i] = makeOneNegative(array[i]);
        }
        return negatives;
    }

    public static long[] makeAllNegative(long[] array) {
        long[] negatives = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            negatives[i] = makeOneNegative(array[i]);
        }
        return negatives;
    }

    public static Object[] makeAllNegative(ObjectType type, Object[] array) {
        switch (type) {
            case INTEGER: {
                Integer[] negatives = new Integer[array.length];
                for (int i = 0; i < array.length; i++) {
                    negatives[i] = makeOneNegative((Integer) array[i]);
                }
                return negatives;
            }
            case FLOAT: {
                Float[] negatives = new Float[array.length];
                for (int i = 0; i < array.length; i++) {
                    negatives[i] = makeOneNegative((Float) array[i]);
                }
                return negatives;
            }
            case DOUBLE: {
                Double[] negatives = new Double[array.length];
                for (int i = 0; i < array.length; i++) {
                    negatives[i] = makeOneNegative((Double) array[i]);
                }
                return negatives;
            }
            case LONG: {
                Long[] negatives = new Long[array.length];
                for (int i = 0; i < array.length; i++) {
                    negatives[i] = makeOneNegative((Long) array[i]);
                }
                return negatives;
            }
            default:
                return null;
        }
    }

    public static List<?> makeAllNegative(ObjectType type, List<?> list) {
        List<Object> negatives = new ArrayList<>();
        for (Object o : list) {
            switch (type) {
                case INTEGER:
                    negatives.add(makeOneNegative((Integer) o));
                    break;
                case FLOAT:
                    negatives.add(makeOneNegative((Float) o));
                    break;
                case DOUBLE:
                    negatives.add(makeOneNegative((Double) o));
                    break;
                case LONG:
                    negatives.add(makeOneNegative((Long) o));
                    break;
                default:
                    break;
            }
        }
        return negatives;
    }

    public static int[] makeAllPositive(int[] array) {
        int[] positives = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            positives[i] = makeOnePositive(array[i]);
        }
        return positives;
    }

    public static float[] makeAllPositive(float[] array) {
        float[] positives = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            positives[i] = makeOnePositive(array[i]);
        }
        return positives;
    }

    public static double[] makeAllPositive(double[] array) {
        double[] positives = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            positives[i] = makeOnePositive(array[i]);
        }
        return positives;
    }

    public static long[] makeAllPositive(long[] array) {
        long[] positives = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            positives[i] = makeOnePositive(array[i]);
        }
        return positives;
    }

    public static Object[] makeAllPositive(ObjectType type, Object[] array) {
        switch (type) {
            case INTEGER: {
                Integer[] positives = new Integer[array.length];
                for (int i = 0; i < array.length; i++) {
                    positives[i] = makeOnePositive((Integer) array[i]);
                }
                return positives;
            }
            case FLOAT: {
                Float[] positives = new Float[array.length];
                for (int i = 0; i < array.length; i++) {
                    positives[i] = makeOnePositive((Float) array[i]);
                }
                return positives;
            }
            case DOUBLE: {
                Double[] positives = new Double[array.length];
                for (int i = 0; i < array.length; i++) {
                    positives[i] = makeOnePositive((Double) array[i]);
                }
                return positives;
            }
            case LONG: {
                Long[] positives = new Long[array.length];
                for (int i = 0; i < array.length; i++) {
                    positives[i] = makeOnePositive((Long) array[i]);
                }
                return positives;
            }
            default:
                return null;
        }
    }

    public static List<?> makeAllPositive(ObjectType type, List<?> list) {
        List<Object> positives = new ArrayList<>();
        for (Object o : list) {
            switch (type) {
                case INTEGER:
                    positives.add(makeOnePositive((Integer) o));
                    break;
                case FLOAT:
                    positives.add(makeOnePositive((Float) o));
                    break;
                case DOUBLE:
                    positives.add(makeOnePositive((Double) o));
                    break;
                case LONG:
                    positives.add(makeOnePositive((Long) o));
                    break;
                default:
                    break;
            }
        }
        return positives;
    }
}
