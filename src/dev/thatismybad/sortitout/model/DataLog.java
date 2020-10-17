package dev.thatismybad.sortitout.model;

public class DataLog {
    private int id;
    private String dataType;
    private int numberOfValues;
    private long startTime;
    private long endTime;
    private long timeDiff;

    public int getId() {
        return id;
    }

    public DataLog setId(int id) {
        this.id = id;
        return this;
    }

    public String getDataType() {
        return dataType;
    }

    public DataLog setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    public int getNumberOfValues() {
        return numberOfValues;
    }

    public DataLog setNumberOfValues(int numberOfValues) {
        this.numberOfValues = numberOfValues;
        return this;
    }

    public long getStartTime() {
        return startTime;
    }

    public DataLog setStartTime(long startTime) {
        this.startTime = startTime;
        return this;
    }

    public long getEndTime() {
        return endTime;
    }

    public DataLog setEndTime(long endTime) {
        this.endTime = endTime;
        return this;
    }

    public long getTimeDiff() {
        return timeDiff;
    }

    public DataLog setTimeDiff(long timeDiff) {
        this.timeDiff = timeDiff;
        return this;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%d,%d,%d,%d", id, dataType, numberOfValues, startTime, endTime, timeDiff);
    }
}
