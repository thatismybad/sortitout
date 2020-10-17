package dev.thatismybad.sortitout.utils;

import dev.thatismybad.sortitout.enums.Sort;
import dev.thatismybad.sortitout.model.DataLog;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileUtils {

    private static final String DATA_FOLDER = "data";

    public static void writeToFile(String fileName, Sort type, List<DataLog> dataLogs) {
        FileWriter csvWriter = null;
        try {
            File directory = new File(DATA_FOLDER);
            if (!directory.exists()) {
                directory.mkdir();
            }
            csvWriter = new FileWriter(String.format("%s/%s_%s.csv", DATA_FOLDER, fileName, type.toString().toLowerCase()));
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
