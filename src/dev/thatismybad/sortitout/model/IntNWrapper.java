package dev.thatismybad.sortitout.model;

public abstract class IntNWrapper {
    public abstract IntNWrapper[] generateValues(int n);

    public abstract IntNWrapper[] generatePositiveValues(int n);

    public abstract IntNWrapper[] generateNegativeValues(int n);
}
