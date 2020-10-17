package dev.thatismybad.sortitout;

import dev.thatismybad.sortitout.test.*;

public class App {

    public static final boolean CONSOLE_LOGGING = false;
    public static final int NUMBERS_TO_GENERATE = 100;
    public static final int REPETITIONS = 10;

    public static void main(String[] args) {
        new PrimitiveInteger();
        new PrimitiveFloat();
        new PrimitiveDouble();
        new PrimitiveLong();
        new ObjectArrayInteger();
        new ObjectArrayFloat();
        new ObjectArrayDouble();
        new ObjectArrayLong();
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
