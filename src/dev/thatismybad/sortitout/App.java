package dev.thatismybad.sortitout;

import dev.thatismybad.sortitout.test.PrimitiveInteger;

public class App {

    public static final boolean CONSOLE_LOGGING = false;
    public static final int NUMBERS_TO_GENERATE = 10_000;
    public static final int REPETITIONS = 100;

    public static void main(String[] args) {
        PrimitiveInteger pInt = new PrimitiveInteger();
//        ObjectInteger oInt = new ObjectInteger();

//        app.primitiveIntTest(app);


//        // primitive float
//        System.out.println("\nprimitive float\n");
//        float[] primitiveFloat = app.generatePrimitiveFloats(NUMBERS_TO_GENERATE);
//        float[] primitiveFloatPos = app.makeAllPositive(app.generatePrimitiveFloats(NUMBERS_TO_GENERATE));
//        float[] primitiveFloatNeg = app.makeAllNegative(app.generatePrimitiveFloats(NUMBERS_TO_GENERATE));
//        app.printPrimitiveFloatArray(primitiveFloat);
//        app.printPrimitiveFloatArray(primitiveFloatPos);
//        app.printPrimitiveFloatArray(primitiveFloatNeg);
//
//        // primitive double
//        System.out.println("\nprimitive double\n");
//        double[] primitiveDouble = app.generatePrimitiveDoubles(NUMBERS_TO_GENERATE);
//        double[] primitiveDoublePos = app.makeAllPositive(app.generatePrimitiveDoubles(NUMBERS_TO_GENERATE));
//        double[] primitiveDoubleNeg = app.makeAllNegative(app.generatePrimitiveDoubles(NUMBERS_TO_GENERATE));
//        app.printPrimitiveDoubleArray(primitiveDouble);
//        app.printPrimitiveDoubleArray(primitiveDoublePos);
//        app.printPrimitiveDoubleArray(primitiveDoubleNeg);
//
//        // primitive long
//        System.out.println("\nprimitive long\n");
//        long[] primitiveLong = app.generatePrimitiveLongs(NUMBERS_TO_GENERATE);
//        long[] primitiveLongPos = app.makeAllPositive(app.generatePrimitiveLongs(NUMBERS_TO_GENERATE));
//        long[] primitiveLongNeg = app.makeAllNegative(app.generatePrimitiveLongs(NUMBERS_TO_GENERATE));
//        app.printPrimitiveLongArray(primitiveLong);
//        app.printPrimitiveLongArray(primitiveLongPos);
//        app.printPrimitiveLongArray(primitiveLongNeg);
//
//        // Object int - array
//        System.out.println("\nObject int - array\n");
//        Integer[] objectInt = app.generateObjectIntegers(NUMBERS_TO_GENERATE);
//        Integer[] objectIntPos = (Integer[]) app.makeAllPositive(ObjectType.INTEGER, app.generateObjectIntegers(NUMBERS_TO_GENERATE));
//        Integer[] objectIntNeg = (Integer[]) app.makeAllNegative(ObjectType.INTEGER, app.generateObjectIntegers(NUMBERS_TO_GENERATE));
//        app.printObjectArray(objectInt);
//        app.printObjectArray(objectIntPos);
//        app.printObjectArray(objectIntNeg);
//
//        // Object float - array
//        System.out.println("\nObject float - array\n");
//        Float[] objectFloat = app.generateObjectFloats(NUMBERS_TO_GENERATE);
//        Float[] objectFloatPos = (Float[]) app.makeAllPositive(ObjectType.FLOAT, app.generateObjectFloats(NUMBERS_TO_GENERATE));
//        Float[] objectFloatNeg = (Float[]) app.makeAllNegative(ObjectType.FLOAT, app.generateObjectFloats(NUMBERS_TO_GENERATE));
//        app.printObjectArray(objectFloat);
//        app.printObjectArray(objectFloatPos);
//        app.printObjectArray(objectFloatNeg);
//
//        // Object double - array
//        System.out.println("\nObject double - array\n");
//        Double[] objectDouble = app.generateObjectDoubles(NUMBERS_TO_GENERATE);
//        Double[] objectDoublePos = (Double[]) app.makeAllPositive(ObjectType.DOUBLE, app.generateObjectDoubles(NUMBERS_TO_GENERATE));
//        Double[] objectDoubleNeg = (Double[]) app.makeAllNegative(ObjectType.DOUBLE, app.generateObjectDoubles(NUMBERS_TO_GENERATE));
//        app.printObjectArray(objectDouble);
//        app.printObjectArray(objectDoublePos);
//        app.printObjectArray(objectDoubleNeg);
//
//        // Object long - array
//        System.out.println("\nObject long - array\n");
//        Long[] objectLong = app.generateObjectLongs(NUMBERS_TO_GENERATE);
//        Long[] objectLongPos = (Long[]) app.makeAllPositive(ObjectType.LONG, app.generateObjectLongs(NUMBERS_TO_GENERATE));
//        Long[] objectLongNeg = (Long[]) app.makeAllNegative(ObjectType.LONG, app.generateObjectLongs(NUMBERS_TO_GENERATE));
//        app.printObjectArray(objectLong);
//        app.printObjectArray(objectLongPos);
//        app.printObjectArray(objectLongNeg);
//
//        // Object int - list
//        System.out.println("\nObject int - list\n");
//        List<Integer> objectListInt = (List<Integer>) app.generateObjectList(ObjectType.INTEGER, NUMBERS_TO_GENERATE);
//        List<Integer> objectListIntPos = (List<Integer>) app.makeAllPositive(ObjectType.INTEGER, app.generateObjectList(ObjectType.INTEGER, NUMBERS_TO_GENERATE));
//        List<Integer> objectListIntNeg = (List<Integer>) app.makeAllNegative(ObjectType.INTEGER, app.generateObjectList(ObjectType.INTEGER, NUMBERS_TO_GENERATE));
//        app.printObjectList(objectListInt);
//        app.printObjectList(objectListIntPos);
//        app.printObjectList(objectListIntNeg);
//
//        // Object float - list
//        System.out.println("\nObject float - list\n");
//        List<Float> objectListFloat = (List<Float>) app.generateObjectList(ObjectType.FLOAT, NUMBERS_TO_GENERATE);
//        List<Float> objectListFloatPos = (List<Float>) app.makeAllPositive(ObjectType.FLOAT, app.generateObjectList(ObjectType.FLOAT, NUMBERS_TO_GENERATE));
//        List<Float> objectListFloatNeg = (List<Float>) app.makeAllNegative(ObjectType.FLOAT, app.generateObjectList(ObjectType.FLOAT, NUMBERS_TO_GENERATE));
//        app.printObjectList(objectListFloat);
//        app.printObjectList(objectListFloatPos);
//        app.printObjectList(objectListFloatNeg);
//
//        // Object double - list
//        System.out.println("\nObject double - list\n");
//        List<Double> objectListDouble = (List<Double>) app.generateObjectList(ObjectType.DOUBLE, NUMBERS_TO_GENERATE);
//        List<Double> objectListDoublePos = (List<Double>) app.makeAllPositive(ObjectType.DOUBLE, app.generateObjectList(ObjectType.DOUBLE, NUMBERS_TO_GENERATE));
//        List<Double> objectListDoubleNeg = (List<Double>) app.makeAllNegative(ObjectType.DOUBLE, app.generateObjectList(ObjectType.DOUBLE, NUMBERS_TO_GENERATE));
//        app.printObjectList(objectListDouble);
//        app.printObjectList(objectListDoublePos);
//        app.printObjectList(objectListDoubleNeg);
//
//        // Object long - list
//        System.out.println("\nObject long - list\n");
//        List<Long> objectListLong = (List<Long>) app.generateObjectList(ObjectType.LONG, NUMBERS_TO_GENERATE);
//        List<Long> objectListLongPos = (List<Long>) app.makeAllPositive(ObjectType.LONG, app.generateObjectList(ObjectType.LONG, NUMBERS_TO_GENERATE));
//        List<Long> objectListLongNeg = (List<Long>) app.makeAllNegative(ObjectType.LONG, app.generateObjectList(ObjectType.LONG, NUMBERS_TO_GENERATE));
//        app.printObjectList(objectListLong);
//        app.printObjectList(objectListLongPos);
//        app.printObjectList(objectListLongNeg);
    }

//    private Runnable primitiveIntTest(App app) {
//        return (() -> {
//
//        });
//    }
}
