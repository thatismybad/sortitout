package dev.thatismybad.sortitout.utils;

import dev.thatismybad.sortitout.App;
import dev.thatismybad.sortitout.model.DataLog;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MeasureUtils {
    public static void measureIt(Runnable func, DataLog dataLog) {
        long startTime = new Date().getTime();
        func.run();
        long endTime = new Date().getTime();
        long timeDiff = endTime - startTime;

        dataLog
                .setStartTime(startTime)
                .setEndTime(endTime)
                .setTimeDiff(timeDiff);
        println("==== start time: " + startTime);
        println("==== end time: " + endTime);
        println("==== time diff: " + (endTime - startTime) + " ====");
    }

    public static void print(Object object) {
        if (App.CONSOLE_LOGGING) {
            System.out.print(object);
        }
    }

    public static void println() {
        if (App.CONSOLE_LOGGING) {
            System.out.println();
        }
    }

    public static void println(boolean printItAnyway) {
        if (App.CONSOLE_LOGGING || printItAnyway) {
            System.out.println();
        }
    }

    public static void println(Object object, boolean printItAnyway) {
        if (App.CONSOLE_LOGGING || printItAnyway) {
            System.out.println(object);
        }
    }

    public static void println(Object object) {
        if (App.CONSOLE_LOGGING) {
            System.out.println(object);
        }
    }

    public static void printTime(String message, long ms) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println(String.format("%s [%s]", message, sdf.format(new Date(ms))));
    }

    public static void printTimeDiff(String message, long start, long end) {
        System.out.println(String.format("%s: %dms", message, (end - start)));
    }
}
