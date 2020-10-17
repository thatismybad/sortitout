package dev.thatismybad.sortitout.utils;

import dev.thatismybad.sortitout.enums.Sort;
import dev.thatismybad.sortitout.model.DataLog;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileUtils {
    public static void writeToFile(String fileName, Sort type, List<DataLog> dataLogs) {
        FileWriter csvWriter = null;
        try {
            csvWriter = new FileWriter(String.format("data/%s_%s.csv", fileName, type.toString().toLowerCase()));
            csvWriter.append("Id,Data Type,Number of Values,Start Time,End Time,Time Diff\n");

            for (DataLog data : dataLogs) {
                csvWriter.append(data.toString());
                csvWriter.append("\n");
            }

            csvWriter.flush();
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
