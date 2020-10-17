package dev.thatismybad.sortitout.utils;

import dev.thatismybad.sortitout.App;
import dev.thatismybad.sortitout.model.DataLog;

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

    public static void println(Object object) {
        if (App.CONSOLE_LOGGING) {
            System.out.println(object);
        }
    }
}
