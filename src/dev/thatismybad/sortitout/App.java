package dev.thatismybad.sortitout;

import dev.thatismybad.sorting.agent.InstrumentationAgent;
import dev.thatismybad.sortitout.test.*;

public class App {


    public static boolean CONSOLE_LOGGING = false;
    public static boolean OBJECT_TYPES = false;
    public static boolean PRIMITIVE_TYPES = false;
    public static int NUMBERS_TO_GENERATE = 100;
    public static int REPETITIONS = 1;
    public static int NUMBER_OF_NESTING = 1;

    public static final int NESTING_MIN = 0;
    public static final int NESTING_MAX = 10;

    private static final Class<?>[] nestedTypeClasses = {
            IntN1Array.class,
            IntN2Array.class,
            IntN3Array.class,
            IntN4Array.class,
            IntN5Array.class,
            IntN6Array.class,
            IntN7Array.class,
            IntN8Array.class,
            IntN9Array.class,
            IntN10Array.class
    };

    public static Class<?> getInstanceOfClass(int index) {
        return nestedTypeClasses[index];
    }

    public static void printObjectSize(Object object) {
        System.out.println("Object type: " + object.getClass() + ", size: " + InstrumentationAgent.getObjectSize(object) + " bytes");
    }

    /**
     * Main method of application
     *
     * @param args - args[0] - numbers to generate (int)
     *             - args[1] - repetitions (int)
     *             - args[2] - logging to console (true/false)
     *             - args[3] - number of nesting (int) - 0 disables testing
     *             - args[4] - object types (true/false)
     *             - args[5] - primitive types (true/false)
     */
    public static void main(String[] args) {
        runConfig(args);
        try {
            runNestingTest();
            if (PRIMITIVE_TYPES) runPrimitivesTest();
            if (OBJECT_TYPES) runObjectsTest();
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        //        IntN1Wrapper n1 = new IntN1Wrapper(Integer.MAX_VALUE);
        //        printObjectSize(n1);
    }

    private static void runConfig(String... args) {
        try {
            for (int i = 0; i < args.length; i++) {
                switch (i) {
                    case 0:
                        NUMBERS_TO_GENERATE = Integer.parseInt(args[i]);
                        break;
                    case 1:
                        REPETITIONS = Integer.parseInt(args[i]);
                        break;
                    case 2:
                        CONSOLE_LOGGING = Boolean.parseBoolean(args[i]);
                        break;
                    case 3:
                        NUMBER_OF_NESTING = Math.min(Math.max(Integer.parseInt(args[i]), NESTING_MIN), NESTING_MAX);
                        break;
                    case 4:
                        OBJECT_TYPES = Boolean.parseBoolean(args[i]);
                        break;
                    case 5:
                        PRIMITIVE_TYPES = Boolean.parseBoolean(args[i]);
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Something went terribly wrong.");
            System.out.println(String.format("Error: %s", e.getMessage()));
        }

        System.out.println(
                String.format(
                        "Numbers to generate: %d%n" +
                                "Number of repetitions: %d%n" +
                                "Number of nesting: %d%n" +
                                "Nesting - min: %d | max: %d%n" +
                                "Console logging?: %s" +
                                "Testing objects?: %s%n" +
                                "Testing primitives?: %s%n",
                        NUMBERS_TO_GENERATE,
                        REPETITIONS,
                        NUMBER_OF_NESTING,
                        NESTING_MIN,
                        NESTING_MAX,
                        CONSOLE_LOGGING ? "yes" : "no",
                        OBJECT_TYPES ? "yes" : "no",
                        PRIMITIVE_TYPES ? "yes" : "no"
                )
        );
    }

    private static void runNestingTest() throws IllegalAccessException, InstantiationException {
        for (int i = 0; i < NUMBER_OF_NESTING; i++) {
            getInstanceOfClass(i).newInstance();
        }
    }

    private static void runObjectsTest() {
        new ObjectArrayInteger();
        new ObjectArrayFloat();
        new ObjectArrayDouble();
        new ObjectArrayLong();
    }

    private static void runPrimitivesTest() {
        new PrimitiveInteger();
        new PrimitiveFloat();
        new PrimitiveDouble();
        new PrimitiveLong();
    }
}
